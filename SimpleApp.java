import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SimpleApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Java App");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button clicked!"));
        frame.getContentPane().add(button);

        frame.setVisible(true);
    }
}