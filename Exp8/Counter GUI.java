import javax.swing.*;
import java.awt.event.*;

public class CounterGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("Counter");

        JLabel label = new JLabel("Counter:");
        label.setBounds(30, 30, 80, 30);

        JTextField tf = new JTextField("0");
        tf.setBounds(100, 30, 100, 30);

        JButton up = new JButton("Count Up");
        up.setBounds(30, 80, 100, 30);

        JButton down = new JButton("Count Down");
        down.setBounds(140, 80, 120, 30);

        JButton reset = new JButton("Reset");
        reset.setBounds(270, 80, 80, 30);

        // Actions
        up.addActionListener(e -> {
            int num = Integer.parseInt(tf.getText());
            tf.setText(String.valueOf(num + 1));
        });

        down.addActionListener(e -> {
            int num = Integer.parseInt(tf.getText());
            tf.setText(String.valueOf(num - 1));
        });

        reset.addActionListener(e -> {
            tf.setText("0");
        });

        f.add(label);
        f.add(tf);
        f.add(up);
        f.add(down);
        f.add(reset);

        f.setSize(400, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}