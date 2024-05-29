/*
create a package called co.develhope.advancedOperations
create class Start inside package co.develhope.advancedOperations
create method main inside class Start
declare variable int apples and assign value 3
declare variable int oranges and assign value 4
declare variable int costSingleOrange and assign value 1.5
declare variable int costSingleApple and assign value 2.1
declare variable double appleTotalCost and assign value apples*costSingleApple
declare variable double orangesTotalCost and assign value oranges*costSingleOrange
declare variable double basketTotalCost and assign the sum of apple and oranges cost
print basketTotalCost
 */
public class Start {
    public static void main(String[] args) {
        int apples = 3;
        int oranges = 4;
        int costSingleOrange = (int)1.5f;
        int costSingleApple = (int)2.1f;
        double appleTotalCost = apples*costSingleApple;
        double orangesTotalCost = oranges*costSingleOrange;
        double basketTotalCost = appleTotalCost + orangesTotalCost;
        System.out.println("The total cost is: "+ basketTotalCost);
    }
}
