public class Start {
    public static void main(String args[]){
        System.out.println("The program is starting");

        int a = 5;
        int b = 3;
        System.out.println("The integer A is: "+ a);
        System.out.println("The integer B is: "+ b);

        //Soma
        int sum = a+b;
        System.out.println("This sum is: "+ sum);

        //Subtração
        int diff = a-b;
        System.out.println("This difference is: "+ diff);

        //Multiplicação
        int prod = a*b;
        System.out.println("This product is: "+ prod);

        //Divisão por inteiro
        int ratInt = a/b;
        System.out.println("This ratio is: "+ ratInt);

        //Divisão por float
        float ratFloat = (float)a/(float)b;
        System.out.println("This ratio is: "+ ratFloat);

        //Divisão por double
        double ratDouble = (double)a/(double)b;
        System.out.println("This ratio is: "+ ratDouble);

        System.out.println("The program is ending");
    }
}
