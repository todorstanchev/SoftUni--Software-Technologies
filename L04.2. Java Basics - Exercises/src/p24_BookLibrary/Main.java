package p24_BookLibrary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bookCount = Integer.parseInt(scanner.nextLine());

        BookLibrary library = new BookLibrary() {{
            setName("Library");
            setBooks(new ArrayList<>());
        }};

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        for (int index = 0; index < bookCount; index++) {

            String[] bookTokens = scanner.nextLine().split(" ");

            Book book = new Book() {{
                setTitle(bookTokens[0]);
                setAuthor(bookTokens[1]);
                setPublisher(bookTokens[2]);
                setReleaseDate(LocalDate.parse(bookTokens[3], df));
                setIsbn(bookTokens[4]);
                setPrice(Double.parseDouble(bookTokens[5]));
            }};

            library.getBooks().add(book);
        }

        library.getBooks()
                .stream()
                .collect(
                        Collectors.groupingBy(Book::getAuthor,
                                Collectors.summingDouble(Book::getPrice)))
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int comparisonResult = Double.compare(b.getValue(), a.getValue());

                    if (comparisonResult == 0) {
                        comparisonResult = a.getKey().compareTo(b.getKey());
                    }

                    return comparisonResult;
                })
                .forEach(kvp -> {
                    String author = kvp.getKey();
                    double pricesTotalSum = kvp.getValue();

                    System.out.printf("%s -> %.2f%n", author, pricesTotalSum);
                });
    }
}