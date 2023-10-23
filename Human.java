public class Human {

  String name;
  int age;
  double weight;

  // constructor
  Human(String name, int age, double weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  void eat() {
    System.out.println(this.name + " is eating");
  }

}