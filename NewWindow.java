import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
  
  JFrame frame = new JFrame();
  JLabel label = new JLabel("I'm a new window");

  NewWindow() {

    label.setBounds(100,100,300,100);
    label.setFont(new Font("Arial", Font.BOLD, 20));

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,420);
    frame.setLayout(null);
    frame.add(label);
    frame.setVisible(true);
  }
}
