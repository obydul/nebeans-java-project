package super_keyword;

public class Car extends Vehicle {

    int gear;

    public Car(int gear, String c, double w) {
        super(c, w);
        this.gear = gear;
    }

    @Override
    void displayInfo() {
//        System.out.println("Color : " + color);
//        System.out.println("Weight : " + weight);
        super.displayInfo();
        System.out.println("Gear : " + gear);

    }
}
