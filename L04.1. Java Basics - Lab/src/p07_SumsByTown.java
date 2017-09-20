import java.util.Scanner;
import java.util.TreeMap;

public class p07_SumsByTown {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int linesCount = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Double> townsIncomes = new TreeMap<>();

        for (int index = 0; index < linesCount; index++) {

            String[] inputTokens = scanner.nextLine().split("\\|");

            String town = inputTokens[0].trim();
            double income = Double.parseDouble(inputTokens[1].trim());

            if (!townsIncomes.containsKey(town)) {

                townsIncomes.put(town, income);
            } else {
                townsIncomes.put(town, townsIncomes.get(town) + income);
            }
        }

        for (String town : townsIncomes.keySet()) {
            System.out.println(town + " -> " + townsIncomes.get(town));
        }
    }
}