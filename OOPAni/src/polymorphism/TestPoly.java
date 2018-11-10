package polymorphism;

public class TestPoly {

    public static void main(String[] args) {
        Shape s = new Shape();
        Reactangle r = new Reactangle(10, 12);
        Triangle t = new Triangle(6, 8);
        System.out.println("Shape : " + s.area());
        System.out.println("Reactangle : " + r.area());
        System.out.println("Triangle : " + t.area());
        System.out.println("\n");

        Shape s1 = new Shape();
        Shape s2 = new Reactangle(11, 13);
        Shape s3 = new Triangle(8, 9);
        System.out.println("Shape : " + s1.area());
        System.out.println("Reactangle : " + s2.area());
        System.out.println("Triangle : " + s3.area());

        System.out.println("\n");

        Shape[] shap = new Shape[3];
        shap[0] = new Shape();
        shap[1] = new Reactangle(15, 16);
        shap[2] = new Triangle(5, 7);
        System.out.println("Shape : " + shap[0].area());
        System.out.println("Reactangle : " + shap[1].area());
        System.out.println("Triangle : " + shap[2].area());

        System.out.println("\n");
        for (int i = 0; i < shap.length; i++) {
            System.out.println(shap[i].area());

        }
    }

}
