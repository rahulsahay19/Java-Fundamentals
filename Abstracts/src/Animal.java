public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //this needs to be implemented by derived class
    //Interfaces are by default purely abstract
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
