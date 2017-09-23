package p25_BookLibraryModification;

import p24_BookLibrary.Book;
import p24_BookLibrary.BookLibrary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

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

        LocalDate startReleaseDate = LocalDate.parse(scanner.nextLine(), df);

        library.getBooks()
                .stream()
                .filter(b -> b.getReleaseDate().isAfter(startReleaseDate))
                .sorted((a, b) -> {
                    int comparisonResult = a.getReleaseDate().compareTo(b.getReleaseDate());

                    if (comparisonResult == 0) {
                        comparisonResult = a.getTitle().compareTo(b.getTitle());
                    }

                    return comparisonResult;
                })
                .forEach(b -> {

                    System.out.printf(
                            "%s -> %s%n", b.getTitle(), df.format(b.getReleaseDate()));
                });
    }
}