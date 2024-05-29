/*
create a package called co.develhope.advancedOperations
create class Start inside package co.develhope.advancedOperations
create method main inside class Start
declare variable boolaen doesItRain and assign value true
declare variable boolaen isHot and assign value true
print NOT isHot
print doesItRain AND isHot
print doesItRain OR isHot
 */
public class Start {
    public static void main(String[] args) {
        boolean doesItRain = true;
        boolean isHot = true;

        boolean result1 = !isHot;
        boolean result2 = doesItRain && isHot;
        boolean result3 = doesItRain || isHot;
        System.out.println("NOT is Hot: " +result1);
        System.out.println("doesItRain AND isHot: " + result2);
        System.out.println("doesItRain OR isHot: " + result3);
    }
}
