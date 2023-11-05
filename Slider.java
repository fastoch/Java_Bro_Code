import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider implements ChangeListener {
  
  JFrame frame;
  JPanel panel;
  JLabel label;
  JSlider slider;

  Slider() {
    frame = new JFrame("Slider demo");
    panel = new JPanel();
    label = new JLabel();
    slider = new JSlider(0, 100, 25); // min, max, starting point

    slider.setPreferredSize(new Dimension(400,300)); // width, height
    slider.setPaintTicks(true); // paint graduations
    slider.setMinorTickSpacing(5); // spacing between minor graduations
    slider.setMajorTickSpacing(25);
    slider.setPaintLabels(true); // add values to major ticks
    slider.setPaintTrack(true);
    slider.setFont(new Font("Console", Font.PLAIN, 16));

    slider.setOrientation(SwingConstants.VERTICAL); 

    panel.add(slider);
    panel.add(label);
    frame.add(panel);
    frame.setSize(500,500);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  @Override
  public void stateChanged(ChangeEvent e) {

  }
}
