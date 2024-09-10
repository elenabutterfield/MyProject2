import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeatingChar(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String input = "abracadabra";
        System.out.println("First non-repeating character: " + firstNonRepeatingChar(input));
    }
    }
