public class Start {
    public static int sum(int a, int b) {
        //Funciona como função em Js
        //Função com retorno
        int soma = a+b;
        return soma;
    }

    public static int sum(int a, int b, int c) {
        int result = sum(a,b);
        return sum(result, c);

    }

    public static void sumAndPrint(int a, int b) {
        //Função sem retorno
        int sum = sum(a,b);
        System.out.println("The result of the sum between "+ a +" and "+ b +" is "+sum);
    }

    public static void printArray(int[] array) {
        //Função para Array
        //Condição se array estiver vazio
        if (array==null)return;
        for (int i = 0; i < array.length ; i++) {
            System.out.println("["+i+"] : "+array[i]);
        }
    }


    public static void printArray(double[] array) {
        if (array==null)return;
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Double ["+i+"] : "+array[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("The program is starting");
        System.out.println("--------------------------");
        int myFirstNumber =2;
        int mySecondNumber = 3;
        //Duas formas de exibição
        int result = sum(myFirstNumber,mySecondNumber);
        sum(3,6, 56);
        System.out.println("The result of the sum between "+ myFirstNumber +" and "+ mySecondNumber +" is "+result);
        //Essa chama a função diretamente para exibição
        System.out.println("The result of the sum between "+ myFirstNumber +" and "+ mySecondNumber +" is "+sum(myFirstNumber,mySecondNumber));

        //Versão mais limpa e clara de codigo
        sumAndPrint(myFirstNumber,mySecondNumber);



        //Testando função com array, pode haver o mesmo nome mas o recebimento é diferente se feito duas vezes
        int myArray[] = new int[]{1,2,3,4};
        printArray(myArray);

        double myArrayDouble[] = new double[]{1,2,3,4};
        printArray(myArrayDouble);

        System.out.println("--------------------------");
        System.out.println("The program is ending");
    }
}
