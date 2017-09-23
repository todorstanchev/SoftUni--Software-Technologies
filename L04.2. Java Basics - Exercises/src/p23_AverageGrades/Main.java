package p23_AverageGrades;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        List<p23_AverageGrades.Student> students = new ArrayList<>();

        for (int index = 0; index < studentsCount; index++) {

            String[] studentsTokens = scanner.nextLine().split(" ");

            String name = studentsTokens[0];

            Double[] grades = Arrays.stream(studentsTokens)
                    .skip(1)
                    .map(Double::parseDouble)
                    .toArray(Double[]::new);

            p23_AverageGrades.Student student = new p23_AverageGrades.Student() {{

                setName(name);
                setGrades(Arrays.asList(grades));
            }};

            students.add(student);
        }

        p23_AverageGrades.Student[] filteresStudents = students
                .stream()
                .filter(s -> s.getAverageGrade() >= 5.00)
                .sorted((a, b) -> {
                    int comparisonResult = a.getName().compareTo(b.getName());

                    if (comparisonResult == 0) {

                        comparisonResult = Double.compare(b.getAverageGrade(), a.getAverageGrade());
                    }

                    return comparisonResult;
                })
                .toArray(Student[]::new);

        for (Student student : filteresStudents) {

            System.out.printf(
                    Locale.US,
                    "%s -> %.2f%n",
                    student.getName(),
                    student.getAverageGrade()
            );
        }
    }
}