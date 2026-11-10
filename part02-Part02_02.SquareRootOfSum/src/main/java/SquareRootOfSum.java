
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.valueOf(scanner.nextLine()) + Integer.valueOf(scanner.nextLine());
        double sr = Math.sqrt(n);
        
        System.out.println(sr);

    }
}
