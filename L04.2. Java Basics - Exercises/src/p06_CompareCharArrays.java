import java.util.Scanner;

public class p06_CompareCharArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] firstArr = scanner.nextLine()
                .replaceAll(" ", "")
                .toCharArray();

        char[] secondArr = scanner.nextLine()
                .replaceAll(" ", "")
                .toCharArray();

        int minLenght = Math.min(firstArr.length, secondArr.length);

        for (int index = 0; index < minLenght; index++) {

            if (firstArr[index] > secondArr[index]) {

                System.out.println(secondArr);
                System.out.println(firstArr);

                break;

            } else if (firstArr[index] < secondArr[index]) {

                System.out.println(firstArr);
                System.out.println(secondArr);

                break;

            } else {

                if (index == minLenght - 1 && minLenght == firstArr.length) {

                    System.out.println(firstArr);
                    System.out.println(secondArr);

                } else if (index == minLenght - 1 && minLenght == secondArr.length) {

                    System.out.println(secondArr);
                    System.out.println(firstArr);
                }
            }
        }
    }
}