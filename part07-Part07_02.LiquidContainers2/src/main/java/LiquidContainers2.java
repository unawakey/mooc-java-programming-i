
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container c1 = new Container();
        Container c2 = new Container();

        final int MAX_AMOUNT = 100;

        while (true) {
            System.out.println("First: " + c1.getLiquidAmount() + "/" + MAX_AMOUNT + "\n"
                    + "Second: " + c2.getLiquidAmount() + "/" + MAX_AMOUNT);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String command = input.split(" ")[0];
            int amount = Integer.parseInt(input.split(" ")[1]);

            if (command.equals("add")) {
                c1.add(amount);
                
                System.out.println("");
                continue;
            }

            if (command.equals("move")) {
                if (amount > c1.getLiquidAmount()) {
                    c2.add(c1.getLiquidAmount());
                    c1.remove(amount);
                    
                    System.out.println("");
                    continue;
                }

                c2.add(amount);
                c1.remove(amount);

                System.out.println("");
                continue;
            }

            if (command.equals("remove")) {
                c2.remove(amount);

                System.out.println("");
            }

        }
    }

}
