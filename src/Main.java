public class Main {

    public static void main(String[] args) {


        Car car1 = new Car("porsche");
        Car car2 = new Car("audi");
        Car car3 = new Car("bmw");

        Car[] car = {car1, car2, car3};

        System.out.println(car[0].make);
        System.out.println(car[1].make);
        System.out.println(car[2].make);


        }

    }
