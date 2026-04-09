import javax.swing.*;
import java.awt.event.*;

public class StationarySystem {

    public static void main(String[] args) {

        JFrame f = new JFrame("Stationary Purchase System");

        JCheckBox cb1 = new JCheckBox("Notebook @ 50");
        cb1.setBounds(50, 50, 150, 30);

        JCheckBox cb2 = new JCheckBox("Pen @ 30");
        cb2.setBounds(50, 90, 150, 30);

        JCheckBox cb3 = new JCheckBox("Pencil @ 10");
        cb3.setBounds(50, 130, 150, 30);

        JButton btn = new JButton("Order");
        btn.setBounds(80, 180, 100, 30);

        btn.addActionListener(e -> {
            int total = 0;

            if (cb1.isSelected()) {
                String qty = JOptionPane.showInputDialog("Enter Quantity for Notebook");
                int q = Integer.parseInt(qty);
                total += q * 50;
                JOptionPane.showMessageDialog(f, "Notebook Quantity: " + q + "\nTotal: " + (q * 50));
            }

            if (cb2.isSelected()) {
                String qty = JOptionPane.showInputDialog("Enter Quantity for Pen");
                int q = Integer.parseInt(qty);
                total += q * 30;
            }

            if (cb3.isSelected()) {
                String qty = JOptionPane.showInputDialog("Enter Quantity for Pencil");
                int q = Integer.parseInt(qty);
                total += q * 10;
            }

            JOptionPane.showMessageDialog(f, "Total Amount: " + total);
            JOptionPane.showMessageDialog(f, "Successfully Ordered!");
        });

        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(btn);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}