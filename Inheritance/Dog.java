
class Dog extends Animal {
    Dog(String name) {
        super(name); // Call the constructor of the parent class
    }

    void bark() {
        System.out.println(name + " is barking");
    }
}