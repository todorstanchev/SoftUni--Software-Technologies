import java.util.Scanner;

public class p04_VowelOrDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char symbol = input.charAt(0);

        if (symbol == 'a' || symbol == 'e' || symbol == 'i' ||
                symbol == 'o' || symbol == 'u' || symbol == 'y') {

            System.out.println("vowel");

        } else if (Character.isDigit(symbol)) {

            System.out.println("digit");

        } else {

            System.out.println("other");
        }
    }
}