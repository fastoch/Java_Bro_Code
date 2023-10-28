import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*; // not compatible with .mp3 files
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

    File file = new File("/home/fastoch/Music/Takeoff.wav");
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);

    Scanner scanner = new Scanner(System.in);
    String response = ""; 

    while(!response.equals("Q")) {
      System.out.println("P = play, S = stop, R =reset, Q = quit");
      response = scanner.next();
      response = response.toUpperCase();

      switch(response) {
        case "P":
          clip.start();
          break;
        case "S":
          clip.stop();
          break;
        case "R":
          clip.setMicrosecondPosition(0);
          break;
        case "Q":
          clip.close();
          break;
        default:
          System.out.println("Invalid input");
      }
    }

    scanner.close();
    audioStream.close();
  }
}