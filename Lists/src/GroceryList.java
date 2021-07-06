import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();
    public void addItem(String item){
        groceryList.add(item);
    }
    public void printItems(){
        for(int i = 0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " +groceryList.get(i));
        }
    }
    public void modifyItem(int pos, String newItem){
        groceryList.set(pos, newItem);
        System.out.println("Grocery item " + (pos+1) + " modified");
    }
    public void removeItem(int pos){
        String item = groceryList.get(pos);
        groceryList.remove(pos);
        System.out.println(item + " is removed");
    }

    public String findItem(String searchItem){
       // boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >=0){
            return groceryList.get(position);
        }
        return null;
    }
}
