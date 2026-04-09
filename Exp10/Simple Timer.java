import javax.swing.*;
import java.awt.event.*;

public class TimerDemo {

    static int count = 0;

    public static void main(String[] args) {

        JFrame f = new JFrame("Timer");

        JLabel label = new JLabel("0");
        label.setBounds(120, 30, 100, 30);

        JButton start = new JButton("Start");
        start.setBounds(50, 80, 80, 30);

        JButton stop = new JButton("Stop");
        stop.setBounds(150, 80, 80, 30);

        Timer timer = new Timer(1000, e -> {
            count++;
            label.setText(String.valueOf(count));
        });

        start.addActionListener(e -> timer.start());
        stop.addActionListener(e -> timer.stop());

        f.add(label);
        f.add(start);
        f.add(stop);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}