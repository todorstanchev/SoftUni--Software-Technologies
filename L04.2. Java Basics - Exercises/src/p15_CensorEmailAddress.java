import java.util.Scanner;

public class p15_CensorEmailAddress {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String emailAddress = scanner.nextLine();

        String[] emailAddressTokens = emailAddress.split("@");

        String name = emailAddressTokens[0];
        String domain = '@' + emailAddressTokens[1];

        String replacement = "";

        for (int index = 0; index < name.length(); index++) {

            replacement += '*';
        }

        replacement += domain;

        String email = scanner.nextLine();

        String result = email.replaceAll(emailAddress, replacement);

        System.out.println(result);
    }
}