import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Integer is class, where as int is primitive type
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int i =0; i<10; i++){
            //since i is int. hence auto boxing. converting the integer to class wrapper
           // integerArrayList.add(Integer.valueOf(i));
            integerArrayList.add(i);
        }

        //access like
        for(int i =0; i<10; i++){
            //unboxing. Taking from class and converting to integer
            //System.out.println(i + "--> " + integerArrayList.get(i).intValue());
            System.out.println(i + "--> " + integerArrayList.get(i));
        }

        //Implicit way
        Integer myIntVal = 77; //Integer.valueOf(77);
        int myInt =  myIntVal; //myIntVal.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for(double i =0.0; i<10.0; i+=0.7){
            myDoubleValues.add(i);
        }
        //Access
        for(int i =0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }


}
