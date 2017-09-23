import java.util.LinkedHashMap;
import java.util.Scanner;

public class p18_Phonebook {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        String command = input[0];

        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();

        while (!command.equals("END")) {

            String name = input[1];

            switch (command) {

                case "A":
                    String phoneNumber = input[2];
                    phonebook.put(name, phoneNumber);
                    break;
                case "S":
                    System.out.println(
                            phonebook.containsKey(name)
                                    ? String.format("%s -> %s", name, phonebook.get(name))
                                    : String.format("Contact %s does not exist.", name));
                    break;
            }

            input = scanner.nextLine().split(" ");

            command = input[0];
        }
    }
}