class Cat extends Animal {
    Cat(String name) {
        super(name); // Call the constructor of the parent class
    }

    void meow() {
        System.out.println(name + " is meowing");
    }
}