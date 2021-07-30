import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int x = 98;
//        int y = 0;
//        System.out.println(divideByL(x,y));
//        System.out.println(divideEAFP(x,y));
//        System.out.println(divide(x,y));
        int X = getIntExceptionHandling();
        System.out.println("x is: " +X);
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static int getIntValid() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer");
        String input = s.next();
        for (int i =0; i<input.length(); i++){
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }
        if(isValid){
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntExceptionHandling() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        try{
            return s.nextInt();
        } catch (InputMismatchException e){
            return 0;
        }
    }

    private static int divideByL(int x, int y){
        if(y!=0){
            return x/y;
        }else{
            return 0;
        }
    }
    private static int divideEAFP(int x, int y){
        try{
            return x/y;
        }
        catch (ArithmeticException ex){
            return 0;
        }
    }
    private static int divide(int x, int y){
         return x/y;
    }
}
