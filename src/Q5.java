public class Q5  {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Is " + number + " even? " + isEven(number));

        number = 7;
        System.out.println("Is " + number + " even? " + isEven(number));
    }

    public static boolean isEven(int i) {

        return (i & 1) == 0;
    }
}