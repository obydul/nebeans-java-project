package this_keyword;

public class Person {

    String name;
    int age;
    String hairColor;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String hairColor) {
        this(name, age);
        this.hairColor = hairColor;
    }
    void message(){
        System.out.println("This is this keyword");
    }

    void display() {
        //this.message();
        message();
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Hair color : " + hairColor);
        System.out.println("");
    }
}
