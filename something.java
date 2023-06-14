import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class something {
    public static void main(String[] args) {
        Frame window = new Frame();

        window.setVisible(true);
        window.setSize(300,200);
        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}