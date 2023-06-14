import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class myFrame extends Frame {
    public myFrame() {
        setVisible(true);
        setSize(300,200);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setBackground(Color.darkGray);
    }

    public boolean mouseDown(AWTEvent evt, int x, int y) {
        System.out.println("Mouse down at " + x + ", " + y);
        return true;
    }

    public void paint(Graphics g) {
        g.drawLine(50, 50, 150, 150);
    }

    public static void main(String[] args) {
        new myFrame();
    }
}