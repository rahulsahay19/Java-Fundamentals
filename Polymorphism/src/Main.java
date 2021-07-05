public class Main {
    public static void main(String[] args) {
        System.out.println("In the main method");
        for (int i = 1; i<11; i++){
            Movie movie = RandomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }

    //Return random movie
    public static Movie RandomMovie(){

        int random = (int) (Math.random() * 5) +1;
        System.out.println("Random no generated was:" + random);
        switch (random){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new DieAnotherDay();
            case 4:
                return new MazeRunner();
            case 5:
                return new Dummy();

        }
        return null;
    }
}
