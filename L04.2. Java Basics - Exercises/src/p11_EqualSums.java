import java.util.Arrays;
import java.util.Scanner;

public class p11_EqualSums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (nums.length == 1) {
            System.out.println(0);

            return;
        }

        for (int index = 0; index < nums.length; index++) {

            int leftSum = 0;

            for (int pos = 0; pos < index; pos++) {

                leftSum += nums[pos];
            }

            int rightSum = 0;

            for (int cnt = index + 1; cnt < nums.length; cnt++) {

                rightSum += nums[cnt];
            }

            if (leftSum == rightSum) {

                System.out.println(index);

                return;
            }
        }

        System.out.println("no");
    }
}