public abstract class AbstractItem implements Item{
    protected String name;
    protected double price;
    protected boolean available;

    public AbstractItem(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    //restituisce il nome dell'articolo
    public String getName(){
        return "";
    };

    //restituisce il prezzo dell'articolo
    public double getPrice() {
        return 0;
    }

    //restituisce la disponibilità dell'articolo
    public boolean isAvailable() {
        return false;
    }

    public abstract String displayDetails();
}
