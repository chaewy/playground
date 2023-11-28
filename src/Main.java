public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Porsche");
        Car car2 = new Car("Audi","Germany");

        System.out.println(car1.make);
        System.out.println(car1.origin);
        System.out.println(car1.power);
        System.out.println(car2.make);
        System.out.println(car2.origin);
        System.out.println(car2.power);

        System.out.println();

        car1.desc();
        car2.desc();

        }

    }
