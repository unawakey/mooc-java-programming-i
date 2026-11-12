
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String s = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        int n = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double d = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string "
                + s);
        System.out.println("You gave the integer "
                + n);
        System.out.println("You gave the double "
                + d);
        System.out.println("You gave the boolean "
                + bool);
    }
}
