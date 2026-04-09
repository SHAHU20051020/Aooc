import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ColorChange {

    public static void main(String[] args) {

        JFrame f = new JFrame("Color Change");

        JButton btn = new JButton("Change Color");
        btn.setBounds(80, 80, 120, 30);

        btn.addActionListener(e -> {
            Color c = JColorChooser.showDialog(f, "Select Color", Color.WHITE);
            f.getContentPane().setBackground(c);
        });

        f.add(btn);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}