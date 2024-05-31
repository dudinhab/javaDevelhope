/*
create a package called co.develhope.methods
create class Start inside package co.develhope.methods
create method main inside class Start
Declare variable integer apples and assign value 3
Declare variable integer oranges and assign value 4
declare variable double appleCost and assign value 1.4
declare variable double orangesCost and assign value 2.4
create a static method called calculatePrice
    it has two arguments: the price of the single item and the quantity of the single item
    Returns a double
    Evaluates the total cost: price * quantity
Print the final cost of the apples and oranges
 */
public class Start {
    public static double calculatePrice(int item, double price) {
        double count = item*price;
        return count;
    }

    public static void main(String[] args) {
        int apples=3;
        int oranges=4;
        double appleCost = 1.4;
        double orangesCost = 2.4;
        System.out.println("Final cost Apple: "+ calculatePrice(apples, appleCost));
        System.out.println("Final cost Orange: "+ calculatePrice(oranges, orangesCost));
    }
}
