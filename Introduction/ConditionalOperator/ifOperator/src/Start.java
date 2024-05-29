public class Start {
    public static void main(String[] args) {
        System.out.println("The program is starting");
        System.out.println("----------------------------------------");
        int hour = 24;
        boolean isAfternoon = hour > 15;

        System.out.println("---------- First mode for IF ----------");
        //PRIMEIRO MODO DE IF
        //Condição para executar um comando
        if (isAfternoon) {
            //Se verdadeiro ele executa o primeiro bloco
            System.out.println("Good Afternoon!");
        }else{
            //else (senao) ele executa por padrão o segundo bloco
            System.out.println("Good Morning!");
        }

        System.out.println("---------- Second mode for IF ----------");
        //SEGUNDO MODO DE IF
        if(hour<13){
            System.out.println("Good morning!");
        }else{
            if(hour<20){
                System.out.println("Good afternoon!");
            }else{
                if(hour<23){
                    System.out.println("Good nigth!");
                }else{
                    System.out.println("Midnight!");
                }
            }
        }

        System.out.println("---------- Third mode for IF ----------");
        //TERCEIRO MODO DE IF
        if(hour<13){
            System.out.println("Good morning!");
        }else if(hour<20){
            System.out.println("Good afternoon!");
        }else if(hour<23){
            System.out.println("Good nigth!");
        }else{
            System.out.println("Midnight!");
        }

        System.out.println("----------------------------------------");
        System.out.println("The program is ending");
    }
}
