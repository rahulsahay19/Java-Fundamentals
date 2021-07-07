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
    public void modifyItem(String currentItem, String newItem){
        int pos = findItem(currentItem);
        if(pos>=0){
            modifyItem(pos, newItem);
        }
    }
    private void modifyItem(int pos, String newItem){
        groceryList.set(pos, newItem);
        System.out.println("Grocery item " + (pos+1) + " modified");
    }
    public void removeItem(String item){
        int pos = findItem(item);
        if(pos>=0){
            removeItem(pos);
        }
    }
    private void removeItem(int pos){
        groceryList.remove(pos);
    }

    private int findItem(String searchItem){
       return groceryList.indexOf(searchItem);
    }

    public boolean searchItem(String searchItem){
        int pos = findItem(searchItem);
        if(pos>=0){
            return true;
        }
        return false;
    }
    public ArrayList<String> getGroceryList(){
        return groceryList;
    }
}
