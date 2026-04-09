import javax.swing.*;
import java.awt.event.*;

public class RadioButtonDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Gender Selection");

        JLabel label = new JLabel("Select Gender:");
        label.setBounds(30, 30, 150, 30);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(30, 70, 100, 30);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(140, 70, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        JButton btn = new JButton("Submit");
        btn.setBounds(80, 120, 100, 30);

        JLabel result = new JLabel("");
        result.setBounds(30, 160, 200, 30);

        btn.addActionListener(e -> {
            if (male.isSelected()) {
                result.setText("Selected: Male");
            } else if (female.isSelected()) {
                result.setText("Selected: Female");
            } else {
                result.setText("Please select gender");
            }
        });

        f.add(label);
        f.add(male);
        f.add(female);
        f.add(btn);
        f.add(result);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}