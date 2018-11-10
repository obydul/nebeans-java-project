package abstractclass;

public class Reactangle extends Shape {

    public Reactangle(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    @Override
    void area() {
        double result = dimension1 * dimension2;
        System.out.println("Reactangle result : " + result);
    }

}
