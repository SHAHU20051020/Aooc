import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField tf;
    double num1, num2, result;
    char operator;

    Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(null);

        tf = new JTextField();
        tf.setBounds(30, 20, 220, 30);
        add(tf);

        String buttons[] = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0","=","+","C",
                "√","x²","%",""
        };

        int x = 30, y = 70;

        for (int i = 0; i < buttons.length; i++) {
            JButton b = new JButton(buttons[i]);
            b.setBounds(x, y, 50, 40);
            add(b);
            b.addActionListener(this);

            x += 60;
            if ((i + 1) % 4 == 0) {
                x = 30;
                y += 50;
            }
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("[0-9]")) {
            tf.setText(tf.getText() + cmd);
        } else if (cmd.equals("C")) {
            tf.setText("");
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(tf.getText());

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
                case '%': result = num1 % num2; break;
            }

            tf.setText(String.valueOf(result));
        } else if (cmd.equals("√")) {
            num1 = Double.parseDouble(tf.getText());
            tf.setText(String.valueOf(Math.sqrt(num1)));
        } else if (cmd.equals("x²")) {
            num1 = Double.parseDouble(tf.getText());
            tf.setText(String.valueOf(num1 * num1));
        } else {
            num1 = Double.parseDouble(tf.getText());
            operator = cmd.charAt(0);
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}