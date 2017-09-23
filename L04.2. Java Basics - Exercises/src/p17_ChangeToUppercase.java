import java.util.Scanner;

public class p17_ChangeToUppercase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (true) {

            int startIndex = text.indexOf("<upcase>");
            int endIndex = text.indexOf("</upcase>");

            if (startIndex == -1 || endIndex == -1) {

                break;
            }

            String temp = text.substring(startIndex + 8, endIndex);
            String upperTemp = temp.toUpperCase();

            text = text.replaceAll("<upcase>" + temp + "</upcase>", upperTemp);
        }

        System.out.println(text);
    }
}