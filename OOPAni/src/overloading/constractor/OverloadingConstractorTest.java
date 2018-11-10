
package overloading.constractor;

public class OverloadingConstractorTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(); 
        Teacher t2 = new Teacher("Obydul", "Male"); 
        Teacher t3 = new Teacher("Shaker", "Female", 123654); 
        t2.displayInformation();
        t3.displayInformation();
    }
}
