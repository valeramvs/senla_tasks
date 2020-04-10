package one;

import java.util.Random;

public class Runner {
    /**
     * Task: Написать программу выводящую на экран случайно сгенерированное
     * трёхзначное натуральное число и его наибольшую цифру
     */
    public static void main(String[] args) {
        int number = 100 + new Random().nextInt(900);
        int[] array = new int[3];

        int i = 2;
        while (number > 0) {
            array[i] = number % 10;
            number /= 10;
            i--;
        }

        int max = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }

        System.out.println("Random number = " + number);
        System.out.println("Max digit = " + max);
    }

}
