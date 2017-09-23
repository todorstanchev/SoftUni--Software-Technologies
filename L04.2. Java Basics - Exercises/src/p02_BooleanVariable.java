import java.util.Scanner;

public class p02_BooleanVariable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isBoolean = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(isBoolean ? "Yes" : "No");
    }
}