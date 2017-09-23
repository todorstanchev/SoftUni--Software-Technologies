import java.util.Scanner;
import java.util.TreeMap;

public class p19_PhonebookUpgrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        String command = input[0];

        TreeMap<String, String> phonebook = new TreeMap<>();

        while (!command.equals("END")) {

            String name = "";
            String phoneNumber = "";

            if (command.equals("ListAll")) {

                for (String personName : phonebook.keySet()) {

                    System.out.println(
                            String.format("%s -> %s", personName, phonebook.get(personName)));
                }
            } else if (command.equals("S")) {

                name = input[1];

                System.out.println(
                        phonebook.containsKey(name)
                                ? String.format("%s -> %s", name, phonebook.get(name))
                                : String.format("Contact %s does not exist.", name));

            } else {

                name = input[1];
                phoneNumber = input[2];
                phonebook.put(name, phoneNumber);
            }

            input = scanner.nextLine().split(" ");

            command = input[0];
        }
    }
}