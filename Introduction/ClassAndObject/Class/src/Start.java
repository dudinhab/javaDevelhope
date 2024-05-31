public class Start {
    public static void main(String[] args) {
        System.out.println("The program is starting");
        System.out.println("-------------------------------------------");
        int i;
        i=4;
        //Criando um novo objeto
        Product computer = new Product();
        //Atribuindo valores para cada variavel interna da classe
        //objeto.variavel da classe
        computer.cost=500;
        computer.availablePiaces = 5;
        computer.subTitle = "The best PC";
        computer.name = "HP Pavillion 5";
        computer.description = "This is the computer description";

        Product iPhone = new Product();
        iPhone.cost=800;
        iPhone.availablePiaces = 4;
        iPhone.subTitle = "The best IPhone";
        iPhone.name = "IPhone 13";
        iPhone.description = " ";

        Product iMac = new Product();
        iMac.cost=1450;
        iMac.availablePiaces = 5;
        iMac.subTitle = "The best IMac";
        iMac.name = "MacBook pro 13";
        iMac.description = " ";

        //Link por entre os arrays
        Product store[] = new Product[]{computer, iPhone, iMac};

        System.out.println("-------------------------------------------");
        System.out.println("The program is ending");
    }
}
