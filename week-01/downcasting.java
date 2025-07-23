// Java Program to demonstrate Explicit downcasting
import java.io.*;
class Animal {
    public void eat()
    {
        System.out.println("The animal is eating.");
    }
}

class Cat extends Animal {
    public void meow()
    {
        System.out.println("The cat is meowing.");
    }
}

class downcasting {
    public static void main(String[] args)
    {
        Animal animal = new Cat();
        animal.eat();

        // Explicit downcasting
        Cat cat = (Cat)animal;
        cat.meow();
    }
}