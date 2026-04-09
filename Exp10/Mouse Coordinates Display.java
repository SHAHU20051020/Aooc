import javax.swing.*;
import java.awt.event.*;

public class MouseCoordinates {

    public static void main(String[] args) {

        JFrame f = new JFrame("Mouse Coordinates");
        JLabel label = new JLabel("Move mouse...");
        label.setBounds(50, 50, 200, 30);

        f.add(label);

        f.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                label.setText("X: " + e.getX() + " Y: " + e.getY());
            }
        });

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}