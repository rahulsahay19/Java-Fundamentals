public class Jaws extends Movie {
    //using inheritance, we are actually initializing the name field from the base class which is Movie class here
    public Jaws() {
        super("Jaws");
    }
    public String plot(){
        return "Shark hunts";
    }
}
