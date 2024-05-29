public class Start {
    public static void main(String[] args) {
        System.out.println("The program is starting");
        System.out.println("------------------------------");
        int hour = 5;
        //Referencia uma variavel para ser comparado o conteúdo
        switch (hour){
            //Compara com o caso, se for igual, ele será executado o bloco
            case 5:
                System.out.println("It's five o'clock");
                break;

            case 10:
                System.out.println("It's ten o'clock");
                break;
            //Caso não tenha sido verdadeira nenhuma comparação, será executado o bloco padrão
            default:
                System.out.println("Cannot determine hour!");
                break;
        }

        //Escrevendo a instrução acima em IF
        if(hour==5){
            System.out.println("It's five o'clock");
        }else if(hour==10){
            System.out.println("It's ten o'clock");
        }else{
            System.out.println("Cannot determine hour!");
        }


        String name = "Duda";
        switch (name){
            //qualquer uma das duas opções, executa este bloco
            case "Duda":
            case "Mattia":
                System.out.println("Duda likes cakes");
                break;

            case "Lorenzo":
                System.out.println("Lorenzo likes basketball");
                break;

            default:
                System.out.println("Who are you?");
                break;
        }

        //Escrevendo a instrução acima em IF
        if(name.equals("Duda")||name.equals("Mattia")) {
            System.out.println("Duda likes cakes");
        } else if (name.equals("Lorenzo")) {
            System.out.println("Lorenzo likes basketball");
        }else{
            System.out.println("Who are you?");
        }

        System.out.println("------------------------------");
        System.out.println("The program is ending");
    }
}
