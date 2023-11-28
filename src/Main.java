public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Porsche","Germany",900);
        Car car2 = new Car("Audi","Germany",800);

        System.out.println(car1.make);
        System.out.println(car1.origin);
        System.out.println(car1.power+" HP");
        System.out.println();
        System.out.println(car2.make);
        System.out.println(car2.origin);
        System.out.println(car2.power+" HP");

        System.out.println();

        car1.desc();
        car2.desc();





        }

    }
