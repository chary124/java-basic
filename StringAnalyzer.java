public class StringAnalyzer {
    public static void main(String[] args) {
        String input = "Hello, world! 123";
        int vowels = 0;
        int alphabets = 0;
        int nonAlphabets = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                alphabets++;
                if (isVowel(ch)) {
                    vowels++;
                }
            } else {
                nonAlphabets++;
            }
        }

        System.out.println("Input string: " + input);
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of alphabets: " + alphabets);
        System.out.println("Number of non-alphabets: " + nonAlphabets);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
