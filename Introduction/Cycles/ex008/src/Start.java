/*
create a package called co.develhope.operatorFor
create class Start inside package co.develhope.operatorFor
create method main inside class Start
create a String array with your colleagues names called myColleagues
Print the length of the array myColleagues
Print all values of myColleagues using a for structure
 */
public class Start {
    public static void main(String[] args) {
        //Criação de um array que recebe os valores
        String myColleagueNames[]=new String[]{"Duda","Lorenzo","Federica"};

        System.out.println("Size of myColleagueNames variable: "+ myColleagueNames.length);

        //Visualização do array através de for para não ter erro na visualização de todos os itens
        for (int i = 0; i < myColleagueNames.length; i++) {
            System.out.println(myColleagueNames[i]);
        }
    }
}
