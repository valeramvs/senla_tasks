package fourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String text = bufferedReader.readLine().toLowerCase();
        String word = bufferedReader.readLine().toLowerCase();
        String[] splittedText = text.split(" ");
        int count = 0;
        for (String eachWord : splittedText) {
            if (eachWord.equals(word)) {
                count++;
            }
        }
        System.out.println("The word '" + word + "' was found in the entered text " + count + " times.");
    }
}
