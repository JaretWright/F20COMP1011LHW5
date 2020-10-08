import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExperiment {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Fred");
        arrayList.add("Drew");
        arrayList.add("Amy");
        arrayList.add("Bart");
        arrayList.add(2,"SQL-Cam");

        System.out.println("ArrayList:  "+ arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Fred");
        linkedList.add("Drew");
        linkedList.add("Amy");
        linkedList.add("Bart");
        linkedList.add(2,"SQL-Cam");
        System.out.println("LinkedList: "+linkedList);
        System.out.println(linkedList.get(2));
    }
}
