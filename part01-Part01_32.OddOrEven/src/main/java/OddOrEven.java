
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Give a number:");
        int n = Integer.valueOf(scan.nextLine());
        int r = n % 2;
        
        if (r == 0) {
            System.out.println("Number " + r + " is even.");
        } else {
            System.out.println("Number " + r + " is odd.");
        }
    }
}
