import java.io.*;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;

public class Client {
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public Client() {
        try {
            System.out.println("Socket is starting up...");
            socket = new Socket("localhost", 8888);
            System.out.println(socket);
            System.out.println("Chat is ready (you can type in your messages)");
            System.out.println();

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            AtomicBoolean isDrop = new AtomicBoolean(false);

            new Thread(() -> {
                try {
                    while (true) {
                        String incomingServerMessage = in.readUTF();
                        if (incomingServerMessage.contains("Server: cmd Exit")) {
                            System.out.println(incomingServerMessage);
                            System.out.println("Please press enter to close command line...");
                            isDrop.set(true);
                            break;
                        }
                        System.out.println("Server: " + incomingServerMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            while (true) {
                if (isDrop.get()) {
                    System.out.println("Closing...");
                    break;
                }
                out.writeUTF(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Client();
    }
}
