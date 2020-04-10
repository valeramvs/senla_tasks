package two.runner;

import two.bouquet.Bouquet;
import two.flowers.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    /**
     * Task: Написать программу содержащую иерархии цветов для
     * цветочного магазина. Собрать букет и определить его стоимость.
     */
    public static void main(String[] args) throws IOException {
        Bouquet bouquet = new Bouquet();
        System.out.println("Enter the name of the flower ('rose', 'daisy', 'carnation', 'peony'). " +
                "Press 'ENTER' and enter the size of the flower ('small', 'medium', 'big') in a new line). " +
                "Enter 'stop' when you finish the bouquet.");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = bf.readLine().toUpperCase();
            if (line.equals("STOP")) {
                break;
            }
            switch (line) {
                case ("ROSE"):
                    Flower rose = new Rose(getSize(bf));
                    bouquet.bunch.add(rose);
                    break;
                case ("DAISY"):
                    Flower daisy = new Daisy(getSize(bf));
                    bouquet.bunch.add(daisy);
                    break;
                case ("PEONY"):
                    Flower peony = new Peony(getSize(bf));
                    bouquet.bunch.add(peony);
                    break;
                case ("CARNATION"):
                    Flower carnation = new Carnation(getSize(bf));
                    bouquet.bunch.add(carnation);
                    break;
            }
        }
        System.out.println("Total bouquet cost = " + bouquet.getCost());
    }

    public static int getSize(BufferedReader bf) throws IOException {
        int size = 0;
        switch (bf.readLine().toUpperCase()) {
            case ("SMALL"):
                size = 1;
                break;
            case ("MEDIUM"):
                size = 2;
                break;
            case ("BIG"):
                size = 3;
                break;
        }
        return size;
    }

}
