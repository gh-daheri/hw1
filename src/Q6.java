import java.util.Scanner;
public class Q6
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter an integer less than or equal to " + n + ": ");
        int input = scanner.nextInt();

        while (input > n) {
            System.out.print("Invalid input! Enter an integer less than or equal to " + n + ": ");
            input = scanner.nextInt();
        }

        System.out.println("Valid input: " + input);

        scanner.close();
    }
}
