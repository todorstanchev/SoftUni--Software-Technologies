import java.util.Scanner;

public class p04_SumNIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int linesNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int index = 0; index < linesNumber; index++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            sum += currentNumber;
        }

        System.out.printf("Sum = %d", sum);
    }
}