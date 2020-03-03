package third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = bufferedReader.readLine();
        String[] words = sentence.split(" ");
        System.out.println("You entered the sentence with " + words.length + " words.");
        Arrays.sort(words);
        for (String word : words) {
            System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));
        }
    }
}
