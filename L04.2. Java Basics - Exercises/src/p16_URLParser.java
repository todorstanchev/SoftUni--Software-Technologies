import java.util.Arrays;
import java.util.Scanner;

public class p16_URLParser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();

        int index = url.indexOf("://");

        String protocol = "";
        String serverResource = "";

        if (index != -1) {

            protocol = url.substring(0, index);

            serverResource = url.substring(index + 3);
        } else {

            serverResource = url;
        }

        index = serverResource.indexOf('/');

        String server = "";
        String resource = "";

        if (index != -1) {

            server = serverResource.substring(0, index);

            resource = serverResource.substring(index + 1);
        } else {

            server = serverResource;
        }

        System.out.println(String.format("[protocol] = \"%s\"", protocol));
        System.out.println(String.format("[server] = \"%s\"", server));
        System.out.println(String.format("[resource] = \"%s\"", resource));
    }
}