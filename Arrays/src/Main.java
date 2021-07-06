import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //used for accepting inputs
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    int[] myArray = getIntegers(5);
    for(int i =0; i< myArray.length; i++){
        System.out.println("Element " + i + " is " + myArray[i]);
    }
        System.out.println("Average is " + getAverage(myArray));
    int[] sortedValues = sortIntegers(myArray);
        System.out.println("Sorted values are:" );
        for(int i =0; i< sortedValues.length; i++){
            System.out.println("Element " + i + " is " + sortedValues[i]);
        }
    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number + "integer values. \r");
        int values[] = new int[number];
        for (int i = 0; i<values.length;i++){
            //Accepts integer from the console
           values[i] = scanner.nextInt();
        }
        return values;
    }
    //Calc average
    public static double getAverage(int[] arr){
        int sum = 0;
        for (int i =0; i<arr.length; i++){
            sum+=arr[i];
        }
        return (double) sum/(double) arr.length;
    }

    public static int[] sortIntegers(int[] arr){
       // int[] sortedArr = new int[arr.length];
//        for (int i = 0; i<sortedArr.length; i++){
//            sortedArr[i] = arr[i];
//        }
        //util way copy method
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i<sortedArr.length-1; i++){
                if(sortedArr[i] > sortedArr[i+1]){
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1]= temp;
                    flag=true;
                }
            }
        }
        return sortedArr;
    }
}
