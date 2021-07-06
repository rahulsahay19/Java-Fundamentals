import java.util.Arrays;
import java.util.Scanner;

public class MinValue {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the count:");
        int count = scanner.nextInt();
        int[] values = readIntegers(count);
        for(int i = 0; i<values.length; i++){
            System.out.println("Entered values are:");
            System.out.println(values[i]);
        }
        System.out.println("Minimum value is: " + findMin(values));
        reverse(values);
        System.out.println("Reverse value is: " + Arrays.toString(values));
    }

    private static int[] readIntegers(int count){
        int[] arr = new int[count];
        for(int i = 0;i<arr.length; i++){
            System.out.println("Enter a number:");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    private static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    private static void reverse(int[] arr){
        int maxIndex = arr.length-1;
        int halfIndex = arr.length/2;
        for (int i = 0; i< halfIndex;i++){
            int temp = arr[i];
            arr[i]=arr[maxIndex-i];
            arr[maxIndex-i] = temp;
        }
    }
}
