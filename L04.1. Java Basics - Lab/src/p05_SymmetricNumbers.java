import java.util.Scanner;

public class p05_SymmetricNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int index = 1; index <= number; index++) {

            String strNum = Integer.toString(index);

            if (isNumberSymetric(strNum)) {

                System.out.printf(strNum + " ");
            }
        }
    }

    private static boolean isNumberSymetric(String strNum) {

        for (int pos = 0; pos < strNum.length() / 2; pos++) {

            if (strNum.charAt(pos) != strNum.charAt(strNum.length() - 1 - pos)) {

                return false;
            }
        }

        return true;
    }
}