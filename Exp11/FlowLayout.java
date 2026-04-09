import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutDemo {

    static JButton prev = null;

    public static void main(String[] args) {

        JFrame f = new JFrame("GridLayout");

        f.setLayout(new GridLayout(2, 3));

        JButton[] btn = new JButton[6];

        for (int i = 0; i < 6; i++) {
            btn[i] = new JButton(String.valueOf(i + 1));
            f.add(btn[i]);

            btn[i].addActionListener(e -> {
                JButton current = (JButton) e.getSource();

                if (prev == null) {
                    prev = current;
                } else {
                    String temp = current.getText();
                    current.setText(prev.getText());
                    prev.setText(temp);
                    prev = null;
                }
            });
        }

        f.setSize(300, 200);
        f.setVisible(true);
    }
}