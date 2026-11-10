
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int n, sum = 0, count = 0, even = 0, odd = 0;
        double avg = 0;
        while (true) {
            n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum += n;
            count++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "
                + sum);
        System.out.println("Numbers: "
                + count);
        System.out.println("Average: "
                + (1.0 * sum / count));
        System.out.println("Even "
                + even);
        System.out.println("Odd: "
                + odd);
    }
}
