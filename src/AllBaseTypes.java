import java.util.Scanner;

    public class AllBaseTypes{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            int intValue = Integer.parseInt(scanner.nextLine());
            System.out.println("Integer value: " + intValue);

            System.out.print("Enter a float: ");
            float floatValue = Float.parseFloat(scanner.nextLine());
            System.out.println("Float value: " + floatValue);

            System.out.print("Enter a double: ");
            double doubleValue = Double.parseDouble(scanner.nextLine());
            System.out.println("Double value: " + doubleValue);

            System.out.print("Enter a character: ");
            char charValue = scanner.nextLine().charAt(0);
            System.out.println("Character value: " + charValue);

            System.out.print("Enter a boolean (true/false): ");
            boolean booleanValue = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("Boolean value: " + booleanValue);

            scanner.close();
        }
    }

}
