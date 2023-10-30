import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
  public static void main(String[] args) {
    
    JPanel redPanel = new JPanel();
    redPanel.setBackground(Color.RED);
    redPanel.setBounds(0, 0, 250, 250); // top left corner
    
    JPanel bluePanel = new JPanel();
    bluePanel.setBackground(Color.BLUE);
    bluePanel.setBounds(0, 0, 250, 250); // top left corner

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(750, 750);
    frame.setVisible(true);
    frame.add(redPanel);
  }
}