package abstractclass;

public class Circle extends Shape {

    public Circle(double r) {
        super(r, r);
    }

    @Override
    void area() {
        // Circle formula = pi(3.1416) * radius * radius
        double result = Math.PI * dimension1 * dimension2;
        System.out.println("Circle result : " + result);
    }

}
