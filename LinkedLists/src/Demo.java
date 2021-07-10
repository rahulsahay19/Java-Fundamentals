import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Ranchi");
        addInOrder(placesToVisit, "GiddiA");
        addInOrder(placesToVisit, "Barkakana");
        addInOrder(placesToVisit, "Ramgarh");
        addInOrder(placesToVisit, "Deoghar");
        addInOrder(placesToVisit, "Sirka");
        printList(placesToVisit);
        addInOrder(placesToVisit, "Ramgarh");
        visit(placesToVisit);
//        placesToVisit.add("Ranchi");
//        placesToVisit.add("Giddi A");
//        placesToVisit.add("Barkakana");
//        placesToVisit.add("Ramgarh");
//        placesToVisit.add("Deoghar");
//
//        printList(placesToVisit);
//        placesToVisit.add(1, "Sirka");
//        printList(placesToVisit);
//        placesToVisit.remove(1);
//        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> placesToVisit) {
        Iterator iterator = placesToVisit.iterator();
        while(iterator.hasNext()){
            System.out.println("Now Visiting --> "+ iterator.next());
        }
        System.out.println("-------------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        //ListIterator can go back and forth in the list unlike iterator
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            //0 means exact match
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //don't add duplicate one
                System.out.println(newCity + " already added");
                return false;
            } else if(comparison > 0){
                //new city should appear before this one
                //say brisbane already present, then Adelaide should come before
                //then we need to go to previous link and add the record there
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0){
                // move on the next city.
            }
        }
        //add this instant it doesn't find a suitable value to add
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingFwd = true;
        ListIterator<String> listIterator = cities.listIterator();

        //Check if LinkedList is empty
        if(cities.isEmpty()){
            System.out.println("No cities in the list");
            return;
        } else{
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Vacation over");
                    quit = true;
                    break;
                case 1:
                    if(!goingFwd){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingFwd = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting "+listIterator.next());
                    }else {
                        System.out.println("Reached the end of the list");
                        goingFwd = false;
                    }
                    break;
                case 2:
                    if(goingFwd){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingFwd = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting "+listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list");
                        goingFwd = true;
                    }
                    break;
                case 3:
                    if(goingFwd){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now again visiting current city - " + listIterator.previous());
                        }else {
                            System.out.println("We are at the start of the list");
                        }
                    }
                case 4: printMenu();
                break;

            }
        }

    }

    private static void printMenu() {
        System.out.println("Available actions:\n press");
        System.out.println("0 - to quit\n");
        System.out.println("1 - to next city\n");
        System.out.println("2 - to previous city\n");
        System.out.println("3 - to print current city\n");
        System.out.println("4 - to print menu\n");
    }
}
