import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
  public static void main(String[] args) {

    ImageIcon image = new ImageIcon("/home/fastoch/Pictures/profile/archlinux.png");

    JLabel label = new JLabel();
    label.setIcon(image);
    label.setText("Danger Zone!!!");
    label.setHorizontalTextPosition(JLabel.CENTER); // LEFT, CENTER, RIGHT of ImageIcon
    label.setVerticalTextPosition(JLabel.BOTTOM);

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.add(label);
  }
}