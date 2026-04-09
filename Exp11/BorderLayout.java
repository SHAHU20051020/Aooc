import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BorderLayoutDemo {

    public static void main(String[] args) {

        JFrame f = new JFrame("Border Layout");

        JTextField input = new JTextField();
        JTextField result = new JTextField();

        JPanel top = new JPanel();
        top.add(new JLabel("Enter Number"));
        top.add(input);

        JPanel center = new JPanel();
        JButton b1 = new JButton("Binary");
        JButton b2 = new JButton("Octal");
        JButton b3 = new JButton("Hex");

        center.add(b1);
        center.add(b2);
        center.add(b3);

        JPanel bottom = new JPanel();
        bottom.add(new JLabel("Result"));
        bottom.add(result);

        // Actions
        b1.addActionListener(e -> {
            int n = Integer.parseInt(input.getText());
            result.setText(Integer.toBinaryString(n));
        });

        b2.addActionListener(e -> {
            int n = Integer.parseInt(input.getText());
            result.setText(Integer.toOctalString(n));
        });

        b3.addActionListener(e -> {
            int n = Integer.parseInt(input.getText());
            result.setText(Integer.toHexString(n));
        });

        f.setLayout(new BorderLayout());

        f.add(top, BorderLayout.NORTH);
        f.add(center, BorderLayout.CENTER);
        f.add(bottom, BorderLayout.SOUTH);

        f.setSize(300, 200);
        f.setVisible(true);
    }
}