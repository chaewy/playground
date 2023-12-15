
public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.go();

    }

}
abstract class Vehicle{

    abstract void go();

}

class Car extends Vehicle{

    @Override
    void go(){
        System.out.println("The car is moving");
    }

}
