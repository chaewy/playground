public class Car {

    String make;
    String origin;
    Integer power;

    Car(String make, String origin, Integer power){
        this.make = make;
        this.origin = origin;
        this.power = power;
    }

    void desc(){
        System.out.println(this.make + " is from "+this.origin + " and equipped with "+ this.power + " HP engine");
    }

}
