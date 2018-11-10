package abstractclass;

public abstract class Shape {

    double dimension1, dimension2;

    Shape(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    abstract void area();
}
