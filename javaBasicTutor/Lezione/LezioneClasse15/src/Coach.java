public class Coach extends Person{
    private int experience;

    public Coach(String firstName, String lastName, int age, int experience) {
        super(firstName, lastName, age);
        this.experience = experience;
    }

    @Override
    public String getRole() {
        return "Coach";
    }
}
