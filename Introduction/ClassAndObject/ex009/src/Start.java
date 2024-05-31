/*
create a package called co.develhope.classes
create class Start inside package co.develhope.classes
create method main inside class Start
create class called Fruit with attributes name, price
In Start class instantiate two object of Fruit called apple and orange
Assign name and price to apple and orange
Put both objects into an array called fruits
Print all the object attributes using a for cycle over the array fruits
 */
public class Start {
    public static void main(String[] args) {
      Fruit apple = new Fruit();
      Fruit orange = new Fruit();

      apple.name = "Apple";
      apple.price = 2.5;
      orange.name = "Orange";
      orange.price = 4.5;

      Fruit fruits[]= new Fruit[]{apple,orange};
      for (int i = 0; i < fruits.length; i++) {
      System.out.println("Name:" + fruits[i].name +" Price: "+ fruits[i].price);
      }
    }
}
