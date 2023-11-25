public class Q10 {
    public static String removePunctuation(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World! This is a sample string.";

        String result = removePunctuation(input);
        System.out.println("String without punctuation: " + result);
    }
}
