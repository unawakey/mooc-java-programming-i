
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int n = scanner.nextInt();
        int result = 1; // So calculation wont multiply with 0
        
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        System.out.println("Factorial: "
                + result);
    }
}
