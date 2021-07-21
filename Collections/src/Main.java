import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Surya", 7, 12);
        //shallow copy. Means data is shared
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);
        seatCopy.get(1).reserve();

        //Reverse the collection
        Collections.reverse(seatCopy);
        printList(seatCopy);

        //shuffle
        Collections.shuffle(seatCopy);
        printList(seatCopy);

        //Min & Max elements based on compareTo
        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat is " + minSeat.getSeatNumber());
        System.out.println("Max seat is " + maxSeat.getSeatNumber());

//        theatre.getSeats();
//        if (theatre.reserveSeat("A11")){
//            System.out.println("Please Pay");
//        }else{
//            System.out.println("Sorry seat is taken");
//        }
//        if (theatre.reserveSeat("A11")){
//            System.out.println("Please Pay");
//        }else{
//            System.out.println("Sorry seat is taken");
//        }
    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
    }
}
