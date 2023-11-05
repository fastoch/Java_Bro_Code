import javax.swing.*;
import java.awt.*;

public class ProgressBar {
  
  JProgressBar progressBar;
  JFrame frame;

  ProgressBar() {
    progressBar = new JProgressBar(0,100);
    frame = new JFrame();

    progressBar.setValue(0);
    // setting frame layout to null implies we set bounds manually
    progressBar.setBounds(50,50,400,60);
    progressBar.setFont(new Font("Courier New", Font.BOLD, 20));
    progressBar.setBackground(Color.DARK_GRAY);
    progressBar.setForeground(Color.MAGENTA);
    progressBar.setStringPainted(true); // display progress percentage

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,200);
    frame.setLayout(null);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.add(progressBar);

    fill();

  }

  public void fill() {
    int value = progressBar.getValue();
    while(value <= 100) {
      progressBar.setValue(value);
      try {
        Thread.sleep(100); // time before next increment in ms
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      value++;
    }
    progressBar.setString("Done!");
  }

}
