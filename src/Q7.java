public class Q7 {
    public static int sumOfOddIntegers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 10; // Example input

        int result = sumOfOddIntegers(n);
        System.out.println("Sum of odd positive integers less than or equal to " + n + ": " + result);
    }
}
}
