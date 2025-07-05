
import java.util.Scanner;

public class BookDescription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book description:");
        String description = scanner.nextLine();

        int count = countWordOccurrences(description, "Uganda");

        System.out.println("The word 'Uganda' appears " + count + " times in the description.");
    }

    public static int countWordOccurrences(String text, String word) {
        String[] words = text.toLowerCase().split("\\s+");
        int count = 0;

        for (String w : words) {
            if (w.equals(word.toLowerCase())) {
                count++;
            }
        }

        return count;
    }
}