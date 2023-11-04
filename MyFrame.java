import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

  JRadioButton radioButton;
  JRadioButton radioButton2;
  JRadioButton radioButton3;

  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    radioButton = new JRadioButton("paëlla");
    radioButton2 = new JRadioButton("pâtes à la bolognaise");
    radioButton3 = new JRadioButton("Souris d'agneau");

    ButtonGroup group = new ButtonGroup();
    group.add(radioButton);
    group.add(radioButton2);
    group.add(radioButton3);

    radioButton.addActionListener(this);
    radioButton2.addActionListener(this);
    radioButton3.addActionListener(this);

    this.add(radioButton);
    this.add(radioButton2);
    this.add(radioButton3);
  
    this.pack(); // Frame size adjusts to fit the components you add
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) { 
    if(e.getSource()==radioButton) {
      System.out.println("You ordered paëlla");
    }
    else if (e.getSource()==radioButton2) {
      System.out.println("You ordered pâtes à la bolognaise");
    }
    else if (e.getSource()==radioButton3) {
      System.out.println("You ordered Souris d'agneau");
    }
  }
}