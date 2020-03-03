package second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException | IOException e) {
                System.err.println("The entered number is not an integer!");
                return;
            }
        }
        System.out.println("Greatest common divisor of " + numbers[0] + " and "
                    + numbers[1] + " is " + NewMath.gcd(numbers[0], numbers[1]));
        System.out.println("Least common multiple of " + numbers[0] + " and "
                + numbers[1] + " is " + NewMath.lcm(numbers[0], numbers[1]));
    }

}
