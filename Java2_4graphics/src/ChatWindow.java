import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ChatWindow {

    private JFrame mainFrame;

    public ChatWindow() {
        mainFrame = new JFrame();
        mainFrame.setTitle("Chat");
        mainFrame.setBounds(100, 300, 500, 700);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainFrame.setLayout(new BorderLayout());

        JPanel top = new JPanel();
        mainFrame.add(top, BorderLayout.CENTER);

        JPanel bot = new JPanel();
        bot.setLayout(new GridLayout(1,2));
        mainFrame.add(bot, BorderLayout.SOUTH);

        JTextArea chat = new JTextArea(20, 38);
        top.add(chat);

        JTextField text = new JTextField(38);
        bot.add(text);

        KeyListener enterListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == e.VK_ENTER) {
                    chat.append(text.getText().concat("\n"));
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
        text.addKeyListener(enterListener);

        ActionListener confirmListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chat.append(text.getText().concat("\n"));
            }
        };

        JButton confirmButton = new JButton("Confirm");
        confirmButton.addActionListener(confirmListener);
        bot.add(confirmButton);

        mainFrame.setVisible(true);
    }
}
