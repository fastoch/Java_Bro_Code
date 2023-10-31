import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

  JButton button; // make button accessible from the constructor
  JLabel label; // make label accessible from the constructor

  MyFrame() {

    ImageIcon icon = new ImageIcon("point.png");
    ImageIcon icon2 = new ImageIcon("smiley.png");

    label = new JLabel();
    label.setIcon(icon2);
    label.setBounds(300, 300, 300, 300);
    label.setVisible(false); // not visible initially

    button = new JButton("Click Me");
    button.setFont(new Font("Monospace", Font.BOLD, 20));
    button.setBounds(300, 200, 250, 100);
    button.addActionListener(e -> label.setVisible(true));
    button.setFocusable(false); // removes the box around the text field
    button.setIcon(icon);
    button.setHorizontalTextPosition(JButton.LEFT);
    button.setForeground(Color.darkGray);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(800, 800);
    this.setVisible(true);
    this.add(button);
    this.add(label); // add label to the frame
  }
}