public class Start {
    public static void main(String[] args) {
        System.out.println("The program is starting");
        System.out.println("------------------------------");
        int myNewInteger;
        myNewInteger =5;

        //Tipos de Array
        double myArrayDouble[] = new double[2];
        float myArrayFloat[] = new float[2];
        byte myArrayByte[] = new byte[2];
        long myArrayLong[] = new long[2];
        boolean myArrayBoolean[] = new boolean[2];
        String myArrayString[] = new String[2];


        //Criando um Array
        int myNewIntegerArray[];
        //Definindo a quantidade de posições que o array vai ter
        myNewIntegerArray = new int[5];
        //Primeira forma de inserir valor em um array
        myNewIntegerArray[0] = 1;
        myNewIntegerArray[1] = 2;
        myNewIntegerArray[2] = 3;
        myNewIntegerArray[3] = 4;
        myNewIntegerArray[4] = 5;

        System.out.println("I will print my first array "+ myNewIntegerArray[0]);
        System.out.println("I will print my first array "+ myNewIntegerArray[1]);
        System.out.println("I will print my first array "+ myNewIntegerArray[2]);
        System.out.println("I will print my first array "+ myNewIntegerArray[3]);
        System.out.println("I will print my first array "+ myNewIntegerArray[4]);

        //Tamanho de array
        System.out.println("My array size is " + myNewIntegerArray.length);
        //Visualizando elementos do array de acordo com o tamanho
        System.out.println("First element by array: " + myNewIntegerArray[0]);
        System.out.println("Last element by array: " + myNewIntegerArray[myNewIntegerArray.length-1]);


        //Segunda forma de inserir valor em um array, utilizando como String
        String myArraySmart[] = new String[]{
            "Duda", "Lorenzo", "Francesco", "Federica"
        };

        System.out.println("This is my Array Smart " + myArraySmart[0]);
        System.out.println("This is my Array Smart " + myArraySmart[1]);
        System.out.println("This is my Array Smart " + myArraySmart[2]);
        System.out.println("This is my Array Smart " + myArraySmart[3]);

        System.out.println("------------------------------");
        System.out.println("The program is ending");
    }
}