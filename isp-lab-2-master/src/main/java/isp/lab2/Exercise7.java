package isp.lab2;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {

    /**
     * This method should generate a random number which
     * represent the position in the given arrays,so
     * the random should be between 0 and 7
     *
     * @return the generated random
     */
    public static int generateARandom() {
        Random rand= new Random();
        return rand.nextInt(7);
    }

    public static boolean searchnumber(int searchable,int[] array){
        for(int i=0;i< array.length; i++){
            if(array[i] == searchable)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] ucl = new int[]{1, 2, 3, 4, 5, 6, 7, 13};
        int[] answers = new int[100];
        int times = generateARandom();
        Scanner keyboard = new Scanner(System.in);
        int entry=0;
        int numberoftries=0;
        int index=0;
        boolean flag=false;
        while(flag == false)
        {
            System.out.println("Enter a number:");
            entry = keyboard.nextInt();
            if(searchnumber(entry,answers)== false){
                answers[index++]=entry;
                numberoftries++;
            }
            if(entry > ucl[times]){
                System.out.println("Too large");
            }
            if(entry < ucl[times]){
                System.out.println("Too small");
            }
            if(entry == ucl[times]) {
                System.out.println("You guessed the number !");
                flag=true;
            }
        }
        System.out.println("Number of tries: "+ numberoftries);
    }
}
