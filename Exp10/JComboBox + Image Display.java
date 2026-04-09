import javax.swing.*;
import java.awt.event.*;

public class ComboImage {

    public static void main(String[] args) {

        JFrame f = new JFrame("Image Selector");

        String items[] = {"Select", "Image1", "Image2"};
        JComboBox cb = new JComboBox(items);
        cb.setBounds(50, 30, 100, 30);

        JLabel imgLabel = new JLabel();
        imgLabel.setBounds(50, 80, 200, 150);

        cb.addActionListener(e -> {
            String selected = (String) cb.getSelectedItem();

            if (selected.equals("Image1")) {
                imgLabel.setIcon(new ImageIcon("img1.jpg"));
            } else if (selected.equals("Image2")) {
                imgLabel.setIcon(new ImageIcon("img2.jpg"));
            }
        });

        f.add(cb);
        f.add(imgLabel);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}