import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private DataInputStream in;
    private DataOutputStream out;

    public Server() {
        try {
            System.out.println("Server is starting up...");
            serverSocket = new ServerSocket(8888);

            System.out.println("Server is waiting for a connection...");
            clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket);
            System.out.println("Chat is ready (you can type in your messages)");
            System.out.println();

            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            new Thread(() -> {
                try {
                    while (true) {
                        String incomingClientMessage = in.readUTF();
                        if (incomingClientMessage.contains("-disconnect")) {
                            out.writeUTF("cmd Exit");
                            break;
                        }
                        System.out.println("Client: " + incomingClientMessage);
                    }

                    System.out.println("Socket shut down");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            while(true) {
                out.writeUTF(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeConnection() {
        try {
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
