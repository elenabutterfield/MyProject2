public class WordCount {

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\W+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "Hello, world!";
        System.out.println("Number of words: " + countWords(input));
    }
    }

