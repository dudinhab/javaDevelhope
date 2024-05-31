public class StartPrint {
    public static void main(String[] args) {
        System.out.println("----------------Start----------------");

        //Operação de instancia (new cria uma instancia de uma classe)
        Product p = new Product();
        Product p2 = new Product();

        p.name = "Whashing machine";
        System.out.println("This product name is "+p.name);

        p2.name = "Coffee machine";
        System.out.println("This product name is "+p.name);

        //Passagem por referencia
        Product store[] = new Product[]{p,p2};
        for (int i = 0; i < store.length; i++) {
            Product pi = store[i];
            System.out.println("The name is: "+pi.name);
        }

        store[0].name = "redmi Xiaomi note 8";
        store[1].name = "HP Pavillion";
    }
}
