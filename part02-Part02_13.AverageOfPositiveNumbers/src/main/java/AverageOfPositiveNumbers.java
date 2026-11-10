
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0, sum = 0;

        while (true) {
            int n = Integer.valueOf(scanner.nextLine());

            if (n == 0) {
                break;
            }

            if (n > 0) {
                count++;
                sum += n;
                continue;
            }
        }

        if (sum != 0) {
            double avg = 1.0 * sum / count;
            System.out.println(avg);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
