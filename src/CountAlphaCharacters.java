public class CountAlphaCharacters {
    public static void main(String[] args) {

        String str = "Hello, World! 123";
        int count = 0;


        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count++;
            }


        }
        System.out.println("Number of alpha characters: " + count);
    }
}
