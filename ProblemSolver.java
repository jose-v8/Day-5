// File: ProblemSolver.java

import java.util.*;
import java.io.*;

public class ProblemSolver {

    // 1. Frequency Counter: Counts the frequency of each character in a string
    public Map<Character, Integer> countCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }

    // 2. Word Occurrence: Counts the number of occurrences of each word in a text file
    public Map<String, Integer> countWordOccurrences(String filePath) throws IOException {
        Map<String, Integer> wordMap = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.toLowerCase().split("\\W+");
            for (String word : words) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }
        reader.close();
        return wordMap;
    }

    // 3. Anagram Grouping: Groups anagrams together from an array of strings
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }

    // 4. First Non-Repeated Character: Finds the first non-repeated character in a string
    public Character findFirstNonRepeatedCharacter(String input) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }
}
