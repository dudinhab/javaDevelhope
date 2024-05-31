public class Start {
    public static void main(String[] args) {
        System.out.println("The program is starting");
        System.out.println("--------------------------------------");


       double myNumber = 11569;
        //While brasico, enquanto a lógica for verdadeira, continua a execução, se a primeira já for falsa, não é feito nada
        while (myNumber>30){
            myNumber = myNumber/2;
            System.out.println("My number is "+(int)myNumber);
        }


        //forma de fazer jogo de azar
        //Logica while com if dentro para quebra da repetição
    while(true) {
        System.out.println("Betting");
        double number = Math.random() * 100;
        System.out.println("The number is " + (int) number);
    if (number<50){
        System.out.println("You continue");
        continue;
    }else if(number<75){
        System.out.println("You Lose!");
        break;
    }else {
        System.out.println("You Win!");
    }
    }

    //Do while é utilizado para fazer a execução do bloco e depois começar a testar se a lógica é verdadeira
      double a=54.0;
        do {
        a=a/2.0;
        }while(a>100);
        System.out.println("The value is: "+ a);

        System.out.println("--------------------------------------");
        System.out.println("The program is ending");
    }
}
