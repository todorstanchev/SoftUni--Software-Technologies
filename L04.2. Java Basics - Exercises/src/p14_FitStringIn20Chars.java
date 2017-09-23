import java.util.Scanner;

public class p14_FitStringIn20Chars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        if (str.length() >= 20) {

            System.out.println(str.substring(0, 20));
        } else {

            int padding = 20 - str.length();

            for (int index = 0; index < padding; index++) {

                str += '*';
            }

            System.out.println(str);
        }
    }
}