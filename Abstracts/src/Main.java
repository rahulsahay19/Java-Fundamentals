public class Main {

    //Abstracts can have member variables which can be inherited. Interfaces can't
    //Interfaces can have variables, which will be all public static final variables
    //Which will be constant value, which can't be changed
    //Interfaces can't have constructors but abstract classes can have
    //All methods of interfaces are automatically public, whereas abstract class can have any visibility
    //Abstract classes can have defined methods, whereas interfaces can't have methods
    //Since, Java8, interfaces can have default methods and static methods as well. Means, methods with implementations
    //Since, Java9, an interface can also contain private methods(commonly used when two default methods in an interfaces share common code)

    public static void main(String[] args) {
        Dog dog = new Dog("tuffy");
        dog.breathe();
        dog.eat();
        Parrot parrot = new Parrot("parry");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
    }
}
