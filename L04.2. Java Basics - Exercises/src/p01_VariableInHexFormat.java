import java.util.Scanner;

public class p01_VariableInHexFormat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int decimalNum = Integer.parseInt(scanner.nextLine(), 16);

        System.out.println(decimalNum);
    }
}