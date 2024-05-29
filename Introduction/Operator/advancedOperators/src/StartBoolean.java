public class StartBoolean {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;

        //A e B devem ser verdadeiros para o resultado ser verdadeiro
        //&& representa a operação AND
        boolean x = a && b;
        //No mínimo A ou B deve ser verdadeiro para o resultado ser verdadeiro
        //|| representa a operação OR
        boolean y = a || b;
        //NOT é uma operação para inverter o boolean indicado
        //! representa a operação NOT
        boolean not = !c;
        //OxOR é uma operação que só é retornado true se os valores forem diferentes
        //^ representa a operação OxOR
        boolean oxor = a^b;

        System.out.println("The and operation is: "+x);
        System.out.println("The or operation is: "+y);
        System.out.println("The NOT operation is: "+not);
        System.out.println("The OxOR operation is: "+oxor);


        // creating boolean
        int age = 31;
        boolean amIOver18 = age>18;
        boolean amILess50 = age<50;
        boolean amI40 = age == 40;

        System.out.println("Am I Over 18? "+amIOver18);
        System.out.println("Am I Less 50? "+amILess50);
        System.out.println("Am I 40? "+ amI40);

        // <= >= ==
    }
}
