package encapsulation;

public class Person {

    public String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
    }

}
