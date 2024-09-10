import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {

    public static List<String> removeDuplicates(List<String> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana"));
        System.out.println("List after removing duplicates: " + removeDuplicates(list));
    }

}
