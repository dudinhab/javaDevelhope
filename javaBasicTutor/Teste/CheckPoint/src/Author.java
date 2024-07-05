public class Author {
    private String firstName, lastName;
    private int age;

    public Author(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
