package fifth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(bufferedReader.readLine());
        if (limit >= 0 && limit <= 100) {
            for (int i = 0; i <= limit; i++) {
                String number = String.valueOf(i);
                StringBuilder reversedNumber = new StringBuilder(number).reverse();
                if (number.equals(reversedNumber.toString())) {
                    System.out.println(number);
                }
            }
        } else {
            System.out.println("The entered number must be between 0 and 100!");
        }
    }
}
