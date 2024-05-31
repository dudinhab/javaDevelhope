public class Product {
    public double cost;
    public int availability;
    public String name;

    //Constructor
    public Product(){

    }

    //Constructor
    public Product(double cost, int availability, String name){
        this.cost = cost;
        this.availability = availability;
        this.name = name;
    }

    public Product(double cost, String name){
        this.cost = cost;
        this.name = name;
        this.availability =10;
    }

    public void printDetails() {
        System.out.println("Product is:"+ this.name);
        System.out.println("Cost is:"+ this.cost);
        System.out.println("Availability is:"+ this.availability);
    }

    public double getMaxIcome() {
        return availability*cost;

    }
}
