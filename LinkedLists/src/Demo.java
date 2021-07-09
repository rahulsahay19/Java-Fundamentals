import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Ranchi");
        placesToVisit.add("Giddi A");
        placesToVisit.add("Barkakana");
        placesToVisit.add("Ramgarh");
        placesToVisit.add("Deoghar");

        printList(placesToVisit);
        placesToVisit.add(1, "Sirka");
        printList(placesToVisit);
        placesToVisit.remove(1);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> placesToVisit) {
        Iterator iterator = placesToVisit.iterator();
        while(iterator.hasNext()){
            System.out.println("Now Visiting --> "+ iterator.next());
        }
        System.out.println("-------------------");
    }
}
