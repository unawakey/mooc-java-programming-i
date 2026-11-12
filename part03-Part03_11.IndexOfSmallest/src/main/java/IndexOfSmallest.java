
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int n = scanner.nextInt();
            if (n == 9999) {
                break;
            }

            numbers.add(n);
        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = numbers.get(0);
        for (int n : numbers) {
            if (smallest > n) {
                smallest = n;
            }
        }

        System.out.print("Smallest number: " + smallest);
        System.out.println("");

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }

    }
}
