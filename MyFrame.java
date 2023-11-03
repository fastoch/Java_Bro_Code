import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    JCheckBox checkBox = new JCheckBox("I'm not a robot");
    checkBox.setFocusable(false);
    checkBox.setFont(new Font("Consolas", Font.PLAIN, 16));
    
    this.add(checkBox);
    this.pack(); // Frame size adjusts to fit the components you add
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    
  }
}