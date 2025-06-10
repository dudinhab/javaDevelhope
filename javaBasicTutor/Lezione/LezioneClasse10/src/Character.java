public abstract class Character {
    protected String name;
    protected int lifePoints;
    protected int manaPoints;
    protected Skill[] skill;


    public Character(String name, int lifePoints, int manaPoints) {
        this.skill = new Skill[10];
        this.name = name;
        this.lifePoints = lifePoints;
        this.manaPoints = manaPoints;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public String getName() {
        return name;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public void addSkill(Skill s) {
        int position = 0;
        boolean pieno = false;
        for (int i = 0; i < skill.length; i++) {
            if (null == skill[i]) {
                position = i;
                break;
            } else if (i == skill.length - 1) {
                pieno = true;
            }
        }
        if (pieno) {
            System.out.println("Array pieno!");
        } else {
            skill[position] = s;
        }

    }

    public Skill getSkill(int i) {
        if (skill.length - 1 > i) {
            return skill[i];
        } else {
            System.out.println("Questa skill non esiste!");
            return null;
        }
    }

    public boolean isAlive() {
        return lifePoints > 0;
    }

    public abstract void attack(Character pg, Skill s);

}
