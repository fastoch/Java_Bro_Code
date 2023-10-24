public class Main {

  public static void main(String[] args) {
    
    Hero hero = new Hero("Batman", 32, "$$$");
    System.out.println(hero.name);
    System.out.println(hero.age);
    System.out.println(hero.power);
    System.out.println();
    System.out.println(hero.toString()); 
  }
}