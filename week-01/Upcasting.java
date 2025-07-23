// Java Program to demonstrate Explicit Upcasting
import java.io.*;

class Animal {
    public void makeSound()
    {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound()
    {
        System.out.println("The dog barks");
    }

    public void fetch()
    {
        System.out.println("The dog fetches a ball");
    }
}
class Upcasting {
    public static void main(String[] args)
    { // Upcasting
        Animal animal = new Dog();
        // Calls the overridden method in Dog class
        animal.makeSound();
      
    }
}