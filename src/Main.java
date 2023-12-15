class Animal{

    void sound(){
        System.out.println("the animal is make a sound");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("the cat is making sound");
    }
}

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Animal animal = new Animal();
        animal.sound();
        cat.sound();

    }
}