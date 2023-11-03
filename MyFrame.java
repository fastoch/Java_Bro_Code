import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

  JButton button; // global variable
  JTextField textField; // global variable

  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    button = new JButton("Submit");
    button.addActionListener(this);

    textField = new JTextField();
    textField.setPreferredSize(new Dimension(250, 40));
    textField.setFont(new Font("Serif", Font.PLAIN, 20));
    textField.setForeground(new Color(0, 255, 0)); // text color
    textField.setBackground(Color.BLACK);
    textField.setCaretColor(Color.WHITE);

    this.add(button);
    this.add(textField);
    this.pack(); // Frame size adjusts to fit the components you add
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button) {
      System.out.println("You typed: " + textField.getText());
      button.setEnabled(false); // disable button after pressing
      textField.setEditable(false); // disable text field after pressing button
    }
  }
}