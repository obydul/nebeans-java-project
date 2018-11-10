package overloading.constractor;

public class Teacher {

    String name, gender;
    int phone;

    Teacher() {
        System.out.println("No Information");
    }

    Teacher(String n, String g) {
        name = n;
        gender = g;
    }

    Teacher(String n, String g, int ph) {
        name = n;
        gender = g;
        phone = ph;
    }

    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phone : " + phone);
        System.out.println("");
    }

}
