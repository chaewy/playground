
public class Main {

    public static void main(String[] args) {

        Car car = new Car("toyota","supra",2001);

        car.setYear(2002);
        car.setMake("proton");

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }

}
class Car {
    private String make;
    private String model;
    private int year;

    Car(String make,String model,int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }
    //getters
    public String getMake() {
        return this.make;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    //setters
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

}