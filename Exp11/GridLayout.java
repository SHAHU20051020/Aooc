import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class FactorialApplet extends Applet implements ActionListener {

    TextField tf, result;
    Button btn;

    public void init() {

        tf = new TextField(10);
        result = new TextField(10);
        btn = new Button("Find Factorial");

        add(new Label("Enter Number:"));
        add(tf);
        add(btn);
        add(new Label("Result:"));
        add(result);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        int n = Integer.parseInt(tf.getText());
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        result.setText(String.valueOf(fact));
    }
}