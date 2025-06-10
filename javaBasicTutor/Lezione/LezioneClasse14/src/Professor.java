public class Professor extends Person{
    private String specialization;

    public Professor(String firstName, String lastName, int age, String specialization){
        super(firstName,lastName,age);
        this.specialization = specialization;
    }

    @Override
    public String getRole() {
        return "Professor";
    }
}
