
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mason
 */
public class EvenOddCounter {

    private static final int RANDOM_NUMBERS = 100;

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int evenNumberCount = 0;
        int oddNumberCount = 0;

        Random randomValue = new Random();

        for (int i = 1; i <= RANDOM_NUMBERS; i++) {
            if (isEven(randomValue.nextInt(i))) {
                evenNumberCount++;
            } else {
                oddNumberCount++;
            }
        }
        System.out.println("Number of even numbers: " + evenNumberCount);
        System.out.println("Number of odd numbers: " + oddNumberCount);
    }

    public static boolean isEven(int num) {
        boolean isEvenNumber = false;

        if ((num % 2) == 0) {
            isEvenNumber = true;
        }
        return isEvenNumber;
    }

}
