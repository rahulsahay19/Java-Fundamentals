public class Main {
    public static void main(String[] args) {
        FootballPlayer ram = new FootballPlayer("Ram");
        BaseballPlayer shyam = new BaseballPlayer("Shyam");
        SoccerPlayer ramesh = new SoccerPlayer("Ramesh");

        Team<FootballPlayer> ghar = new Team("Ghar");
        ghar.addPlayer(ram);
      //  ghar.addPlayer(shyam);
       // ghar.addPlayer(ramesh);
        System.out.println(ghar.numPlayers());
        Team<BaseballPlayer> baseballTeam = new Team("Ranchi club");
        baseballTeam.addPlayer(shyam);
        //Bounded context enforces that T should be substituted with Player itself
        //Team<String> brokenTeam = new Team("this won't work");


//        ArrayList items = new ArrayList();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add("hello");
//
//        for(Object i: items){
//            //This will give class java.lang.String cannot be cast to class java.lang.Integer
//            //This can be fixed by applying types
//            System.out.println((Integer) i*2);
//        }
    }
}
