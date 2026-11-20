
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            System.out.println("Unknown Command");
        }

    }

}
