
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        boolean first = true;
        while (true) {
            String s = scanner.nextLine();
            if (s.isEmpty()) {
                break;
            }

            String[] arr = s.split(",");
            
            int age = Integer.valueOf(arr[1]);

            if (first) {
                oldest = age;
                first = false;
                continue;
            }
            
            if (oldest < age) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: "
                + oldest);
    }
}
