package controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class PicnicController {
    Pattern p = Pattern.compile(" ");
    Map<String, Integer> wordsMap = new HashMap<>();

    public Map<String,Integer>  countOfWords(BufferedReader br) throws IOException {
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
        return  wordsMap;
    }

    public int sumOfWords(BufferedReader br) throws IOException {
        wordsMap = countOfWords(br);
        Integer count = 0;
        for (Integer value : wordsMap.values()) {
                count = count + value;
        }
        return count;
    }

    public String longestWord(BufferedReader br) throws IOException {
        int maxLength = 0;
        String maxWord = "";
        wordsMap = countOfWords(br);
            for (String key : wordsMap.keySet()) {
                if (maxLength < key.length()) {
                    maxLength = key.length();
                    maxWord = key;
                }
            }
        return maxWord;
    }
}
