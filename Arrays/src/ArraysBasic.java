public class ArraysBasic {
    public void ArrayTest(){

    int[] myArray = new int[10];
    printArray(myArray);
}

    private static void printArray(int[] myArray) {
        //        int[] myArray = new int[10];
        //int[] myArray = {1,2,3,4,5,6,7,8,9,10}; //shorthand array initialization

        for(int i = 0; i<myArray.length; i++){
            myArray[i] = i * 10;
        }
        for(int i = 0; i< myArray.length; i++){
            System.out.println("Element is #"+ i + " Value:" + myArray[i]);
        }
    }
}
