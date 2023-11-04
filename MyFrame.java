import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

  JButton button;
  JCheckBox checkBox;

  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    button = new JButton("Toggle");
    button.addActionListener(this);

    checkBox = new JCheckBox("I'm not a robot");
    checkBox.setFocusable(false);
    checkBox.setFont(new Font("Consolas", Font.PLAIN, 16));
    
    this.add(checkBox);
    this.add(button);
    this.pack(); // Frame size adjusts to fit the components you add
    this.setVisible(true);
  }

  @Override
  // Toggle the state of the check box when button is clicked
  public void actionPerformed(ActionEvent e) { 
    if(e.getSource()==button) {
      checkBox.setSelected(!checkBox.isSelected()); 
    }
  }
}