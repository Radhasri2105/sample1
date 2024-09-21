import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        greetUser(name);
    }

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
