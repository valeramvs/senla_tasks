package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        try {
            number = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("The entered number is not an integer!");
            return;
        }
        boolean isComposite = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isComposite = true;
                break;
            }
        }
        boolean isEven = false;
        if (number % 2 == 0) {
            isEven = true;
        }
        if (isEven) {
            System.out.print("The entered number is even");
        } else {
            System.out.print("The entered number is odd");
        }
        if (isComposite) {
            System.out.println(" and composite!");
        } else {
            System.out.println(" and simple!");
        }
    }
}
