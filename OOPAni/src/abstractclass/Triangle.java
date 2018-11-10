package abstractclass;

public class Triangle extends Shape{

    public Triangle(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    @Override
    void area() {
        // triangle formula = half * base * height
        double result = 0.5 * dimension1 * dimension2;
        System.out.println("Triangle result : " + result);
        
    }
    
}
