import java.util.ArrayList;
import java.util.List;

public class FilterStrings {
    public static List<String> filterAndLowercase(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.startsWith("A")) {
                result.add(str.toLowerCase());
            }
        }
        return result;

    }

    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Banana", "Avocado", "Apricot");
        System.out.println("Filtered and lowercased: " + filterAndLowercase(strings));
    }
    }
