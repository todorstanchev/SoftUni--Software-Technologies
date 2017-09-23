import java.util.Arrays;
import java.util.Scanner;

public class p22_IntersectionOfCircles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] firstCircleTokens = readInput(scanner);
        double[] secondCircleTokens = readInput(scanner);

        double x1 = firstCircleTokens[0];
        double y1 = firstCircleTokens[1];
        double radius1 = firstCircleTokens[2];

        double x2 = secondCircleTokens[0];
        double y2 = secondCircleTokens[1];
        double radius2 = secondCircleTokens[2];

        double distanceBetweenCenters =
                Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));

        System.out.println(
                distanceBetweenCenters <= radius1 + radius2
                        ? "Yes"
                        : "No"
        );
    }

    private static double[] readInput(Scanner scanner) {

        double[] inputTokens = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        return inputTokens;
    }
}