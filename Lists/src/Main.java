import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice:");
            choice= scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printItems();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void addItem() {
        System.out.println("Add grocery item");
        //This will take the typed input and pass the same
        groceryList.addItem(scanner.nextLine());
    }
    private static void modifyItem() {
        System.out.println("Enter the current item name:");
        String currentItem = scanner.nextLine();
        System.out.println("Enter the replacement item");
        String newItem = scanner.nextLine();
        groceryList.modifyItem(currentItem, newItem);
    }

    private static void removeItem() {
        System.out.println("Enter the item name:");
        String itemName = scanner.nextLine();
        groceryList.removeItem(itemName);
    }

    private static void searchForItem() {
        System.out.println("Enter the item:");
        String searchItem = scanner.nextLine();
        if(groceryList.searchItem(searchItem)){
            System.out.println("Found " + searchItem + " in the list");
        }else {
            System.out.println(searchItem + " not found");
        }
    }

    private static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        //quick way to copy array into arraylist
        newArray.addAll(groceryList.getGroceryList());
        //another way, creating and initializing
        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        String[] myArr = new String[groceryList.getGroceryList().size()];
        //Returning List into array.
        myArr = groceryList.getGroceryList().toArray(myArr);
    }

    private static void printInstructions() {
        System.out.println("Enter Choice:");
        System.out.println("0 - To print choice options.");
        System.out.println("1 - To print the list of items.");
        System.out.println("2 - To add an item.");
        System.out.println("3 - To modify an item.");
        System.out.println("4 - To remove an item.");
        System.out.println("5 - To search for an item.");
        System.out.println("6 - To quit.");
    }

}
