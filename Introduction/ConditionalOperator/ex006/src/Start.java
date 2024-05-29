/*
create a package called co.develhope.operatorIf
create class Start inside package co.develhope.operatorIf
create int variable age inside class Start and assign your age
Create an if statement with the following rules
If your age is <13 print You are a baby
Else if your age is <20 print You are a teeneger
Else print You are an adult
 */
public class Start {
    public static void main(String[] args) {
        int age = 25;
        
        if (age<13){
            System.out.println("You are a baby");
        }else if(age<20){
            System.out.println("You are a teeneger");
        }else{
            System.out.println("You are an adult");
        }
    }
}
