package controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class PicnicController {
    Pattern p = Pattern.compile(" ");
    Map<String, Integer> wordsMap = new HashMap<>();
    ArrayList<String> wordsList = new ArrayList<>();
    public void countOfWords(BufferedReader br) throws IOException {
        String line = br.readLine();
        while (line != null) {
            String[] tokens = p.split(line.toLowerCase());
            for (String token : tokens) {
                if (!wordsMap.containsKey(token)) {
                    wordsMap.put(token, 1);
                } else {
                    int count = wordsMap.get(token) + 1;
                    wordsMap.replace(token, count);
                }
            }
            line = br.readLine();
        }
        wordsMap.entrySet().stream().sorted((entry1, entry2) -> {
            return entry2.getValue() - entry1.getValue();
        }).forEach(entry -> {
            System.out.println(String.format("%s - %s", entry.getKey(), entry.getValue()));
        });
    }

    public int sumOfWords(BufferedReader br) throws IOException {
        String line = br.readLine();
        int count = 0;
        while (line != null) {
            String[] tokens = p.split(line.toLowerCase());
            for (String token : tokens) {
                wordsList.add(token);
                count++;
            }
            line = br.readLine();
        }
        return count;
    }

    public String longestWord(BufferedReader br) throws IOException {
        String line = br.readLine();

        while (line != null) {
            String[] tokens = p.split(line.toLowerCase());
            for (String token : tokens) {
                String [] words = token.split(" ");
                for(int i = 0 ; i<words.length; i++) {
                    wordsList.add(words[i]);
                }
            }
            line = br.readLine();
        }

        int maxLength = 0;
        String maxWord = null;
        for(String word : wordsList){
            if(word.length() > maxLength){
                maxLength = word.length();
                maxWord = word;
            }
        }
        return maxWord;
    }

}
