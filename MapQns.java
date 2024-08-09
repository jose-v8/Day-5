import java.util.*;
import java.io.*;

public class MapQns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProblemSolver solver = new ProblemSolver();
        LinkedListQn linkedListQn = new LinkedListQn();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Frequency Counter");
            System.out.println("2. Word Occurrence");
            System.out.println("3. Anagram Grouping");
            System.out.println("4. First Non-Repeated Character");
            System.out.println("5. Detect Cycle in LinkedList");
            System.out.println("6. Remove Nth Node from End in LinkedList");
            System.out.println("7. Find Intersection of Two LinkedLists");
            System.out.println("8. Merge Two Sorted LinkedLists");
            System.out.println("9. Reverse LinkedList in Groups of k");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Existing case 1: Frequency Counter
                    System.out.print("Enter a string: ");
                    String input = scanner.nextLine();
                    Map<Character, Integer> frequencyMap = solver.countCharacterFrequency(input);
                    System.out.println("Character Frequency: " + frequencyMap);
                    break;

                case 2:
                    // Existing case 2: Word Occurrence
                    System.out.print("Enter the file path: ");
                    String filePath = scanner.nextLine();
                    try {
                        Map<String, Integer> wordMap = solver.countWordOccurrences(filePath);
                        System.out.println("Word Occurrences: " + wordMap);
                    } catch (IOException e) {
                        System.out.println("Error reading file: " + e.getMessage());
                    }
                    break;

                case 3:
                    // Existing case 3: Anagram Grouping
                    System.out.print("Enter the words separated by commas: ");
                    String[] words = scanner.nextLine().split(",");
                    List<List<String>> anagramGroups = solver.groupAnagrams(words);
                    System.out.println("Anagram Groups: " + anagramGroups);
                    break;

                case 4:
                    // Existing case 4: First Non-Repeated Character
                    System.out.print("Enter a string: ");
                    String str = scanner.nextLine();
                    Character nonRepeatedChar = solver.findFirstNonRepeatedCharacter(str);
                    if (nonRepeatedChar != null) {
                        System.out.println("First Non-Repeated Character: " + nonRepeatedChar);
                    } else {
                        System.out.println("No non-repeated character found.");
                    }
                    break;





                case 10:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
