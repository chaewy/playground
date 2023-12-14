public class Main {

    public static void main(String[] args) {

       Car car1 = new Car("panzer");
       Car car2 = new Car("stuka");
       Car car3 = new Car("junka");

        //put car in garage array
       Car[] garage = {car1,car2,car3};

       for( Car i : garage){
           System.out.println(i.make);
       }


       System.out.println();
       System.out.println(garage[0].make);
       System.out.println(garage[1].make);
       System.out.println(garage[2].make);

    }
}
