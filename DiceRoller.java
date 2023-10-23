import java.util.Random;

public class DiceRoller {

  int number; // global variable
  Random random; // global variable

  DiceRoller() {
    random = new Random();
    rollDice();
  }

  void rollDice() {
    number = random.nextInt(6) + 1;
    System.out.println(number);
  }

}
