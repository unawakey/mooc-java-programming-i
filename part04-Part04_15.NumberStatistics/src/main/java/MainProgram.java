
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics allNums = new Statistics();
        Statistics evenNums = new Statistics();
        Statistics oddNums = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            allNums.addNumber(n);
            if (n % 2 == 0) {
                evenNums.addNumber(n);
            } else {
                oddNums.addNumber(n);
            }
        }

        System.out.println("Sum: " + allNums.sum());
        System.out.println("Sum of even numbers: " + evenNums.sum());
        System.out.println("Sum of odd numbers: " + oddNums.sum());
    }
}
