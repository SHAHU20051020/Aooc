import javax.swing.*;
import java.awt.event.*;

public class TextCount {

    public static void main(String[] args) {

        JFrame f = new JFrame("Text Counter");

        JTextArea ta = new JTextArea();
        ta.setBounds(30, 30, 200, 100);

        JLabel label = new JLabel("Words: 0 Characters: 0");
        label.setBounds(30, 150, 250, 30);

        ta.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String text = ta.getText();
                int words = text.isEmpty() ? 0 : text.split("\\s+").length;
                int chars = text.length();

                label.setText("Words: " + words + " Characters: " + chars);
            }
        });

        f.add(ta);
        f.add(label);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}