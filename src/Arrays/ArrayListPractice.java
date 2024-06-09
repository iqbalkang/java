package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];

        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apple", "produce", 5);

        System.out.println(Arrays.toString(groceryArray));
        System.out.println("_".repeat(50));



        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("banana", "produce", 12));
        groceryList.add(new GroceryItem("cheese"));

        System.out.println(groceryList);

    }
}

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "dairy", 1);
    }
}

//class Arrays.GroceryItem {
//    private String name;
//    private String type;
//    private int count;
//
//    public Arrays.GroceryItem(String name) {
//        this(name, "dairy", 1);
//    }
//
//    public Arrays.GroceryItem(String name, String type, int count) {
//        this.name = name;
//        this.type = type;
//        this.count = count;
//    }
//
//    @Override
//    public String toString() {
//        return "Arrays.GroceryItem{" +
//                "name='" + name + '\'' +
//                ", type='" + type + '\'' +
//                ", count=" + count +
//                '}';
//    }
//}