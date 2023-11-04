import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

  JComboBox<String> comboBox; 

  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    String[] animals = {"Dog", "Cat", "Horse", "Rabbit"};
    comboBox = new JComboBox<>(animals);
    comboBox.addActionListener(this);
    comboBox.addItem("Fish");
    comboBox.insertItemAt("Bird", 0); // insert item "Bird" at index 0
    comboBox.setSelectedIndex(3);// set default selected item
    
    this.setSize(300,300);
    this.add(comboBox);
    this.setLocationRelativeTo(null); // place frame in the center of the screen
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) { 
    if(e.getSource()==comboBox) {
      Object selection = comboBox.getSelectedItem();
      System.out.println(selection);
    }
  }
}