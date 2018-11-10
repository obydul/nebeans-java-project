package polymorphism;

public class Reactangle extends Shape {

    double length, width;

    public Reactangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
