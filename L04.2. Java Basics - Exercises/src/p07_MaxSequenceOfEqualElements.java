import java.util.Arrays;
import java.util.Scanner;

public class p07_MaxSequenceOfEqualElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int currentLength = 1;
        int bestLength = 1;
        int bestStart = numbers[0];

        for (int index = 0; index < numbers.length - 1; index++) {

            int currentNumber = numbers[index];
            int nextNumber = numbers[index + 1];

            if (currentNumber == nextNumber) {

                currentLength++;

                if (currentLength > bestLength) {

                    bestLength = currentLength;
                    bestStart = numbers[index];
                }
            } else {

                currentLength = 1;
            }
        }

        for (int pos = 0; pos < bestLength; pos++) {

            System.out.printf("%d ", bestStart);
        }

        System.out.println();
    }
}