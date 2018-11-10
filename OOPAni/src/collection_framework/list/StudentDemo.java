package collection_framework.list;

import java.util.LinkedList;

public class StudentDemo {

    public static void main(String[] args) {
        LinkedList<Student> st = new LinkedList<>();
        Student s1 = new Student(101, "Obydul", "Nine");
        Student s2 = new Student(102, "Shakera", "Eight");
        Student s3 = new Student(103, "Linkon", "Six");
        Student s4 = new Student(104, "Tarik", "Seven");
        Student s5 = new Student(105, "Sumon", "Five");

        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);

        for (Student s : st) {
            System.out.println(s.id + " " + s.name + " " + s.className);

        }
    }
}
