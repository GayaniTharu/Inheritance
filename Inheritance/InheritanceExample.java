
public class InheritanceExample {
    public static void main(String[] args) {
        // Create instances of the child classes
        Dog myDog = new Dog("Buddy");
        Cat myCat = new Cat("Whiskers");

        // Call methods from the parent class
        myDog.eat();
        myDog.sleep();

        myCat.eat();
        myCat.sleep();

        // Call methods from the child classes
        myDog.bark();
        myCat.meow();
    }
}