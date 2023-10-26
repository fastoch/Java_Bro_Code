public class Main {

  public static void main(String[] args) {
    
    Car car = new Car("Dodge", "Charger", 2016);
    Car car2 = new Car("Nissan", "Skyline", 2018);

    car.copy(car2);

    System.out.println(car); // address in memory
    System.out.println(car2); // address in memory
    System.out.println();
    System.out.println(car.getMake());
    System.out.println(car.getModel());
    System.out.println(car.getYear());
    System.out.println();
    System.out.println(car2.getMake());
    System.out.println(car2.getModel());
    System.out.println(car2.getYear());
  }
}