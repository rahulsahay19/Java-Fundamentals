public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Surya", 7, 12);
        theatre.getSeats();
        if (theatre.reserveSeat("A11")){
            System.out.println("Please Pay");
        }else{
            System.out.println("Sorry seat is taken");
        }
        if (theatre.reserveSeat("A11")){
            System.out.println("Please Pay");
        }else{
            System.out.println("Sorry seat is taken");
        }
    }
}
