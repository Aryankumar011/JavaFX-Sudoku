import java.util.Scanner;

public class PR_22_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int product = num;

        while (true) {
            System.out.print("Enter another integer (or 'q' to quit): ");
            String option = scanner.next();

            if (option.equalsIgnoreCase("q")) {
                break;
            }

            int num2 = Integer.parseInt(option);
            product *= num2;
        }

        System.out.println("The product is: " + product);
        scanner.close();
    }
}
