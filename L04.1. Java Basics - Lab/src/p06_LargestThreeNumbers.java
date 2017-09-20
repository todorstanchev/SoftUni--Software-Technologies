import java.util.Arrays;
import java.util.Scanner;

public class p06_LargestThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Arrays.sort(numbers);

        int count = Math.min(3, numbers.length);

        for (int index = 0; index < count; index++) {

            System.out.println(numbers[numbers.length - 1 - index]);
        }
    }
}