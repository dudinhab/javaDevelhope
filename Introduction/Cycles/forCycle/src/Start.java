import java.io.StringBufferInputStream;

public class Start {
    public static void main(String[] args) {
        System.out.println("The program is starting");
        System.out.println("---------------------------------");
        //Utilizando o for para fazer uma arvore
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }

        //Salta de 5 em 5
        for (int i = 0; i < 20; i+=5) {
            System.out.println("i: "+i);
        }

        //Trabalhando com for em base de um Array
        String myArrayString[] = new String[]{"Duda", "Lorenzo", "Pluto", "Federica"};
        for (int i = 0; i < myArrayString.length ; i++) {
            System.out.println("Array printing position ["+i+"] is: "+ myArrayString[i]);
        }

        System.out.println("Multiply 5");
        int array5[] = new int[10];
        for (int i = 1; i <= 10; i++) {
            array5[i-1]=i*5;
            System.out.println("5 * "+i+" = "+ 5*i);
        }
        for (int i = 9; i >= 0 ; i--) {
            System.out.println(array5[i]);
        }

        System.out.println("---------------------------------");
        System.out.println("The program is ending");
    }
}
