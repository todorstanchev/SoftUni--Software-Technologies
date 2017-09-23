import java.util.Arrays;
import java.util.Scanner;

public class p09_MostFrequentNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] sequence = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxCounter = 0;
        int mostFrequentNumber = sequence[0];

        for (int index = 0; index < sequence.length; index++) {

            int counter = 1;

            for (int pos = index + 1; pos < sequence.length; pos++) {

                if (sequence[index] == sequence[pos]) {

                    counter++;
                }
            }

            if (counter > maxCounter) {

                maxCounter = counter;
                mostFrequentNumber = sequence[index];
            }
        }

        System.out.println(mostFrequentNumber);
    }
}