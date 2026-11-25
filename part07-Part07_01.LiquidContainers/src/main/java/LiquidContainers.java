
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        final int MAX_AMOUNT = 100;

        while (true) {
            System.out.println("First: " + first + "/" + MAX_AMOUNT + "\n"
                    + "Second: " + second + "/" + MAX_AMOUNT);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String command = input.split(" ")[0];
            int amount = Integer.valueOf(input.split(" ")[1]);

            if (command.equals("add")) {
                if (amount < 0) {
                    System.out.println("");
                    continue;
                }
                first += amount;
                if (first > MAX_AMOUNT) {
                    first = MAX_AMOUNT;
                    System.out.println("");
                    continue;
                }
                System.out.println("");
                continue;
            }

            if (command.equals("move")) {
                if (amount < 0) {
                    System.out.println("");
                    continue;
                }

                if (amount > first) {
                    second += first;
                    first = 0;
                    System.out.println("");
                    continue;
                }

                second += amount;
                if (second > MAX_AMOUNT) {
                    second = MAX_AMOUNT;
                }

                first -= amount;
                if (first < 0) {
                    first = 0;
                    System.out.println("");
                    continue;
                }

                System.out.println("");
                continue;
            }

            if (command.equals("remove")) {
                if (amount < 0) {
                    System.out.println("");
                    continue;
                }

                second -= amount;
                if (second < 0) {
                    second = 0;
                    System.out.println("");
                    continue;
                }
                System.out.println("");
                continue;
            }

        }
    }

}
