import java.util.Scanner;

public class p03_ThreeIntegersSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int[] numbers = new int[input.length];

        for (int index = 0; index < input.length; index++) {
            numbers[index] = Integer.parseInt(input[index]);
        }

        int num1 = numbers[0];
        int num2 = numbers[1];
        int num3 = numbers[2];

        if (!checkThreeIntSum(num1, num2, num3)
                && !checkThreeIntSum(num1, num3, num2)
                && !checkThreeIntSum(num2, num3, num1)) {

            System.out.println("No");
        }
    }

    private static boolean checkThreeIntSum(int num1, int num2, int num3) {

        if (num1 + num2 != num3) {
            return false;
        }

        int smallerNum = Math.min(num1, num2);
        int biggerNum = Math.max(num1, num2);

        System.out.printf("%d + %d = %d", smallerNum, biggerNum, num3);

        return true;
    }
}