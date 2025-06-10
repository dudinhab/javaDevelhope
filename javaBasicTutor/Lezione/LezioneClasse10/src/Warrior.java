public class Warrior extends Character{
    private int strenght;

    public Warrior(String name, int lifePoints, int manaPoints) {
        super(name, lifePoints, manaPoints);
    }


    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getStrenght() {
        return strenght;
    }

    //Scrivere un costruttore che inizializzi anche questo attributo, con rispettivi setter e getter. Eseguire poi l’override del metodo attack nel quale il valore di lifePoints del Character attaccato viene diminuito in base al danno della Skill s a cui si somma il valore strenght dell’oggetto Warrior (sempre se il mana è sufficiente per attaccare).

    @Override
    public void attack(Character pg, Skill s) {
        
    }
}
