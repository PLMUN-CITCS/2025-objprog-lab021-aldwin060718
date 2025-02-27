import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        // Get the sentence from the user
        String sentence = getSentenceInput();
        
        // Count the number of words in the sentence
        int wordCount = countWords(sentence);
        
        // Display the word count to the user
        System.out.println("The sentence has " + wordCount + " words.");
    }

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine(); // Read the entire line of text as a sentence
    }

    // Method to count the number of words in a given sentence
    public static int countWords(String sentence) {
        // Split the sentence by spaces to break it into words
        String[] words = sentence.split("\\s+");
        
        // Return the number of words
        return words.length;
    }
}
