
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
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
                name = arr[0];
                first = false;
                continue;
            }

            if (oldest < age) {
                name = arr[0];
                oldest = age;
            }
        }
        System.out.println("Name of the oldest: "
                + name);
    }
}
