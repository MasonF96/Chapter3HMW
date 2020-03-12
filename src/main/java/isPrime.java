
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mason
 */
public class isPrime {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);        
        System.out.println("Write a number.");
        int num = userInput.nextInt();
    }

    public static boolean isPrime(int num) {
        int isPrime = num % num; 

        if (isPrime !=0 || isPrime != 1)
            return false;
        else
           return true;
    }
}
