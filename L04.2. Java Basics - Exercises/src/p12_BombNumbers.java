import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p12_BombNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayList<Integer> nums = new ArrayList<>();

        for (int pos = 0; pos < numbers.length; pos++) {

            nums.add(numbers[pos]);
        }

        int[] bombingInput = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bombNumber = bombingInput[0];
        int powerOfBomb = bombingInput[1];

        for (int index = 0; index < nums.size(); index++) {
            if (nums.get(index) == bombNumber) {
                int leftIndex = Math.max(index - powerOfBomb, 0);
                int rightIndex = Math.min(index + powerOfBomb, nums.size() - 1);

                nums.subList(leftIndex, rightIndex + 1).clear();

                index = -1;
            }
        }

        int sum = nums
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}