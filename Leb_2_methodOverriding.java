/* 
  Create a superclass Animal with a method makeSound(). 
  Create two subclasses Dog and Cat that override the method.
*/

// Superclass
class Animal {

    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("Animal is making a sound...");
    }
}

// Subclass Dog that overrides makeSound()
class Dog extends Animal {

    public void makeSound() {
        System.out.println("Dog is making a sound...");
    }
}

// Subclass Cat that overrides makeSound()
class Cat extends Animal {

    public void makeSound() {
        System.out.println("Cat is making a sound...");
    }
}

// main class
public class Leb_2_methodOverriding {

    public static void main(String[] args) {

        // Create object of Animal class
        Animal a = new Animal();
        a.makeSound();

        // Create object of Cat
        Animal a1 = new Cat();
        a1.makeSound();

        // Create object of Dog
        Animal a2 = new Dog();
        a2.makeSound();

    }
}


/*
 OutPut:
    Animal is making a sound...
    Cat is making a sound...
    Dog is making a sound...
 */