/*
create a package called co.develhope.classes
create class Start inside package co.develhope.classes
create method main inside class Start
create class called Hobby with attributes
    String name
create class called User with attributes
    String firstName
    String lastName
    int age
    Hobby hobby
In Start class instantiate one object of User called user
Assign firstName, lastName, age and hobby
Print all the user values
 */
public class Start {
    public static void main(String[] args) {
        User user = new User();
        user.firstName = "Maria";
        user.lastName = "Barone";
        user.age = 25;
        user.hobby = new String[]{"Eat"};
        System.out.println(user.firstName + " " + user.lastName + " is "+ user.age +" years old and likes "+user.hobby[0]);
    }
}
