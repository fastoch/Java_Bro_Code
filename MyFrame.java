import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

  JButton button; // make button accessible from the constructor

  MyFrame() {

    ImageIcon icon = new ImageIcon("point.png");

    button = new JButton("Click Me");
    button.setFont(new Font("Monospace", Font.BOLD, 16));
    button.setBounds(200, 100, 200, 50);
    button.addActionListener(e -> System.out.println("Lambda Expression"));
    button.setFocusable(false); // removes the box around the text field
    button.setIcon(icon);
    button.setHorizontalTextPosition(JButton.LEFT);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(600, 600);
    this.setVisible(true);
    this.add(button);
  }
}