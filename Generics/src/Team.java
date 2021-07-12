import java.util.ArrayList;

//This is bounded context, where T is said to be Player
//for multiple source, we can extend from onse class and multiple interfaces like shown below
//public class Team<T extends Player & ICoach & IManager> {
//generics type as parameter to the generic interface Comparable
public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already in this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " is picked for the +" + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            won++;
        }else if(ourScore == theirScore){
            tied++;
        }else{
            lost++;
        }
        played++;
        if(opponent!=null){
            opponent.matchResult(null, theirScore, ourScore);
        }
    }
    public int ranking(){
        return (won*2)+tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        } else if(this.ranking() < team.ranking()){
            return 1;
        }
        return 0;
    }
}
