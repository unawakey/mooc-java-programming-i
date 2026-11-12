
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String n = scanner.nextLine();
            System.out.println("");

            if (n.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int d = Integer.valueOf(scanner.nextLine());
            System.out.println("");

            programs.add(new TelevisionProgram(n, d));
        }

        System.out.print("Program's maximum duration? ");
        int maxDur = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDur) {
                System.out.println(program);
            }

        }

    }
}
