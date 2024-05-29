public class Start {
    public static void main(String[] args) {
        double a =58;
        double b=12;
        double c=a+b;
        double ratio = a/b;

        System.out.println("The sum is: "+c);
        //Modulo (pega apenas o restante da divisão)
        double rest = a%b;

        //b vezes a divisão, como os decimais truncados, mais o restante, deve dar a
        double number = b*((int)ratio)+rest;
        System.out.println("Final number is: "+number);

        //apenas o numero inteiro, sendo subtraido o resto e tendo um resultado exato de divisão
        double integerRatio = (a-rest)/b;
        System.out.println("Final number is: "+integerRatio);
    }
}
