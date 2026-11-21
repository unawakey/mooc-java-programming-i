
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            process(command);
        }
    }

    public void process(String command) {
        if (command.equals("add")) {
            add();
        } else if(command.equals("list")) {
            list();
        } else if(command.equals("remove")) {
            remove();
        } else {
            System.out.println("Unknown Command");
        }
    }

    public void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        list.add(task);
    }
    
    public void list() {
        list.print();
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int number = scanner.nextInt();
        list.remove(number);
    }
}
