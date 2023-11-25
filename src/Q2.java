import java.util.Scanner;

public class Q2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer value
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("Integer value: " + intValue);

        // Input a float value
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();
        System.out.println("Float value: " + floatValue);

        // Input a double value
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("Double value: " + doubleValue);

        // Input a character value
        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);
        System.out.println("Character value: " + charValue);

        // Input a boolean value
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("Boolean value: " + booleanValue);

        scanner.close();
    }
}

