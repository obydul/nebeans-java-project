package statics;

public class StudentTwo {

    static int count = 0;

    StudentTwo() {
        count++;
    }

    void totalStudent() {
        System.out.println("Total Student : " + count);
    }
}
