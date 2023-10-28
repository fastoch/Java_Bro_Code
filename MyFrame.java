import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
  MyFrame() {
    this.setTitle("Arch Linux Rocks");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(600, 600);
    this.setVisible(true);
    
    ImageIcon image = new ImageIcon("/home/fastoch/Pictures/profile/Archer.png");
    this.setIconImage(image.getImage());

    this.getContentPane().setBackground(new Color(0x333333));
  }
}
