public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {

    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int age(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public abstract String getRole();
}
