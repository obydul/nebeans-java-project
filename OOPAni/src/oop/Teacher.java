package oop;

public class Teacher {

    String name, gender;
    int phone;

    public Teacher(String name, String gender, int phone) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }
    
    

    void setInformation(String n, String g, int ph){
        name = n;
        gender = g;
        phone = ph;
        
    }
    void displayInformation() {
        System.out.println("Teacher Info :: " + name + " " + gender + " " + phone);
    }
}
