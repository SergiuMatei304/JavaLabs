package isp.lab2;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    /**
     * This method should generate an random number between 2 and 10 then
     * should ask user to enter that amount of numbers from keyboard and
     * store the numbers in an int array which should be returned
     *
     * @return the array of numbers read from keyboard
     */
    private static int[] getUserNumbers() {
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        int rand_number = rand.nextInt(10 - 2) + 2;
        System.out.println("You have to enter:"+rand_number+"numbers");
        int[] Array= new int[rand_number];
        int i;
        for(i=0;i<rand_number;i++)
        { 
          System.out.println("Enter number"+i+":");
          Array[i]= keyboard.nextInt();
        }
        return Array;
    }

    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param userNumbers the numbers used to calculate the arithmetical mean
     * @return the arithmetical mean of the given numbers
     */
    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        int sum=0;
        int i;
        for(i=0;i<userNumbers.length;i++)
            sum+=userNumbers[i];
        double mean=sum/userNumbers.length;
        System.out.println("Media"+mean);
        return mean;
    }

    public static void main(String[] args) {
        int[] userNumbers = getUserNumbers();
        System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers));
    }


}
