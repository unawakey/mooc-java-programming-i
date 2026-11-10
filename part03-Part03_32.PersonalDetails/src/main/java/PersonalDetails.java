
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumYears = 0;
        int count = 0;
        int lastLength = 0;
        String longName = "";
        boolean first = true;

        while (true) {
            String s = scanner.nextLine();
            if (s.isEmpty()) {
                break;
            }

            String[] arr = s.split(",");

            sumYears += Integer.valueOf(arr[1]);
            count++;

            int curLength = arr[0].length();
            if (first) {
                longName = arr[0];
                lastLength = curLength;
                first = false;
                continue;
            }

            if (lastLength < curLength) {
                lastLength = curLength;
                longName = arr[0];
            }
        }
        System.out.println("Longest name: "
                + longName);
        System.out.println("Average of the birth years: "
                + (double) sumYears / count);

    }
}
