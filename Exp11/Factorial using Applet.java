import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {

    public static void main(String[] args) {

        JFrame f = new JFrame("FlowLayout");

        f.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        JCheckBox cb1 = new JCheckBox("Java");
        JCheckBox cb2 = new JCheckBox("Python");
        JCheckBox cb3 = new JCheckBox("C++");

        f.add(cb1);
        f.add(cb2);
        f.add(cb3);

        f.setSize(300, 200);
        f.setVisible(true);
    }
}