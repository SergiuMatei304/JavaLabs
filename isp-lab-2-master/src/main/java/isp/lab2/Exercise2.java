package isp.lab2;

import java.util.Scanner;

public class Exercise2 {

    /**
     * This method should ask user to enter an int which represent
     * the number of points a team have
     *
     * @return the number of points entered by user
     */
    private static int readNumberOfPoints() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You have to enter a number of points:");
        int Points=0;
        Points= keyboard.nextInt();
        return Points;
    }

    /**
     * This method should return a message according with the specifications
     *
     * @param numberOfPoints the number of points entered by user
     * @return The appropriate message
     */
    public static String messageToUser(int numberOfPoints) {
        switch(numberOfPoints)
        {
            case 49:
                return "CFR Cluj";
            case 46:
                return "Universitatea Craiova";
            case 43:
                return "FCSB";
            case 42:
                return "FC Botosani";
            case 40:
                return "Gaz Metan";
            case 39:
                return "Astra Giurgiu";
            default:
                return "No team from Liga 1 have "+numberOfPoints+" points";
        }
    }

    public static void main(String[] args) {
        System.out.println("The message to show to user is:");
        System.out.println(messageToUser(readNumberOfPoints()));
    }
}
