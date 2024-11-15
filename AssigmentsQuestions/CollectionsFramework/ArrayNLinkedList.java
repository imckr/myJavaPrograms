import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayNLinkedList {
    public static void main(String[] args) {
        // Demonstrating ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList elements:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        // Demonstrating LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Frog");

        System.out.println("\nLinkedList elements:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}