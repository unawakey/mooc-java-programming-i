
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.println("");

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("");

            System.out.print("Publication Year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            System.out.println("");

            books.add(new Book(title, pages, pubYear));
        }

        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();
        System.out.println("");

        if (choice.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        }

        if (choice.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

    }
}
