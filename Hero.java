public class Hero extends Person {

  String power;

  Hero(String name, int age, String power) {
    super(name, age); // calls the constructor of the superclass
    this.power = power;
  }

  public String toString() {
    return super.toString() + this.power + "\n"; // calls the toString() method of the superclass
  }
}