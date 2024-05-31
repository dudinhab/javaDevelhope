public class StartProduct {

    public static void main(String[] args) {
        Product p = new Product(10, 5, "Iphone");
        Product p2 = new Product();
        Product p3 = new Product(10, "IMac");

        p.printDetails();
        System.out.println("--------------");
        p2.printDetails();
        System.out.println("--------------");
        p3.printDetails();
        System.out.println("--------------");

        Product store[] = new Product[]{
                p, new Product(50, 1, "appleTV"), p2,p3, new Product(8, 10, "Tesla")
        };

        double money = 0;
        for (int i = 0; i < store.length; i++) {
            Product singleElement = store[i];
            double maxIcome = singleElement.getMaxIcome();
            money =+ maxIcome;
        }
        System.out.println("Max moneys are: "+ money);
    }
}
