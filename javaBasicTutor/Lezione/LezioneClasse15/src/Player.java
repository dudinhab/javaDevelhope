public class Player extends Person{
    private String position;

    public Player(String firstName, String lastName, int age, String position){
        super(firstName,lastName,age);
        this.position = position;
    }

    @Override
    public String getRole() {
        return "Player";
    }
}
