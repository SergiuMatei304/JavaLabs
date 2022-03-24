package isp.lab2;

public class Exercise3 {

    /**
     * This method should verify if a number is prime
     *
     * @param number the number to check
     * @return true if number is prime and false otherwise
     */
    public static boolean isPrimeNumber(final int number) {
        if(number < 2)
            return false;
        if(number == 2)
            return true;
        for (int i = 2; i <= number / 2; i++) {
        if (number % i == 0) {
            return false;
        }
    }
        return true;
    }

    /**
     * This method should calculate the sum of digits of a given number
     *
     * @param number the number used to calculate the sum of digits
     * @return an int representing the sum of digits of the given number
     */
    public static int calculateSumOfDigits(int number) {
        int sum=0;
        while(number!=0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }

    /**
     * This method should extract the prime numbers from a given interval
     * using isPrimeNumber(final int number) method defined above
     * NOTE* a < b
     *
     * @param a the left end of the interval
     * @param b the right end of the interval
     * @return and int array consisting of the prime numbers from the given interval
     */
    public static int[] getPrimeNumbersFromInterval(int a, int b) {
        int index=0;
        int[] primeArray=new int[60];
        if(a<2)
            a=2;
        for(int i=a;i<=b;i++)
            if(isPrimeNumber(i))
                primeArray[index++]=i;
        int newprimeArray[]=new int[index];
        for(int i=0;i<index;i++)
            newprimeArray[i]=primeArray[i];
        return newprimeArray;
    }

    /**
     * This method should calculate the geometric mean of the given prime numbers
     *
     * @param primeNumbers the numbers used to calculate the geometric mean
     * @return the geometric mean of the given numbers
     */
    public static double calculateGeometricMean(int[] primeNumbers) {
        double prod=1;
        for(int i=0;i<primeNumbers.length;i++)
            prod*=primeNumbers[i];
        return Math.pow(prod, 1.0/primeNumbers.length);
    }

    /**
     * This method should calculate the number of prime numbers which
     * have the sum of digits an even number
     * NOTE* use calculateSumOfDigits(int number)
     *
     * @param primeNumbers prime numbers used for calculation
     * @return the numbers which respect the given condition
     */
    public static int numberOfPNWithEvenSumOfDigits(int[] primeNumbers) {
        int number=0;
        for(int i=0;i<primeNumbers.length;i++)
            if(calculateSumOfDigits(primeNumbers[i])%2==0 & primeNumbers[i]!=0)
                number++;
        return number;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 50;
        System.out.println("The geometric mean is: " + calculateGeometricMean(getPrimeNumbersFromInterval(a, b)));
        System.out.println("The number of prime numbers which have the sum of digits an even number is: " + numberOfPNWithEvenSumOfDigits(getPrimeNumbersFromInterval(a, b)));
    }
}
