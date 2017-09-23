import java.util.Scanner;

public class p03_ReverseCharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstChar = scanner.nextLine();
        String secondChar = scanner.nextLine();
        String thirdChar = scanner.nextLine();

        System.out.printf(thirdChar + secondChar + firstChar);
    }
}