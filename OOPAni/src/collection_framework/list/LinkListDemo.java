package collection_framework.list;

import java.util.LinkedList;

public class LinkListDemo {

    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<>();
        s.add("Obydul");
        s.add("Islam");
        s.add("Shakera");
        s.add("Khatun");
        s.addFirst("Md");
        s.addLast("Beauty");
        System.out.println(s);
        for (String name : s) {
            System.out.println(name);

        }
    }
}
