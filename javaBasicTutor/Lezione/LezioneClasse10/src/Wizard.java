public class Wizard extends Character{
    private int abilityPower;

    public Wizard(String name, int lifePoints, int manaPoints) {
        super(name, lifePoints, manaPoints);
    }

    public int getAbilityPower() {
        return abilityPower;
    }

    public void setAbilityPower(int abilityPower) {
        this.abilityPower = abilityPower;
    }

    @Override
    public void attack(Character pg, Skill s) {

    }
}
