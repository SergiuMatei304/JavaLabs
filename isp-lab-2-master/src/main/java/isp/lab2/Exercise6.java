package isp.lab2;

public class Exercise6 {

    /**
     * This method should generate the required vector non-recursively
     *
     * @param n the length of the generated vector
     * @return the generated vector
     */
    public static int[] generateVector(int n) {
        int[] Array= new int[n];
        Array[0]=1;
        Array[1]=2;
        for(int i=2;i<n;i++){
            Array[i]=Array[i-1]*Array[i-2];
        }
        return Array;
    }

    /**
     * This method should generate the required vector recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateRandomVectorRecursively(int n) {
        if(n == 2) {
            int[] array = new int[n];
            array[0] = 1;
            array[1] = 2;
            return array;
        }
        int[] newarray= new int[n];
        System.arraycopy(generateRandomVectorRecursively(n-1),0,newarray,0,n-1);
        newarray[n-1]=newarray[n-2]*newarray[n-3];
        return newarray;
    }

    public static void main(String[] args) {
        int[] generatearray= generateVector(8);
        for(int i=0;i < generatearray.length ; i++){
            System.out.print(generatearray[i]+" ");
        }
        int[] generatearray1= generateRandomVectorRecursively(8);
        for(int i=0;i < generatearray1.length ; i++){
            System.out.print(generatearray1[i]+" ");
        }
    }
}
