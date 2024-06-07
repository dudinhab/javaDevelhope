import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        while (true) {

            if (input == 5) {
                break;
            }

            switch (input) {
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.out.println(3);
                    break;
                case 4:
                    System.out.println(4);
                    break;
                case 5:
                    System.out.println(5);
                    break;
                default:
                    System.out.println("Numero non esiste!");
                    break;
            }
            input = scanner.nextInt();
        }
    }
}
