package Assignments.GroceryList;

public class Main {

    private static void main(String args[]){

        GroceryItemOrder2 apples = new GroceryItemOrder2("apple", 10, 0.50);
        GroceryItemOrder2 bananas = new GroceryItemOrder2("banana", 6, 0.35);
        GroceryItemOrder2 cookies = new GroceryItemOrder2("cookies", 1, 1.00);
        GroceryItemOrder2 tomatoes = new GroceryItemOrder2("tomato", 4, 0.25);
        GroceryItemOrder2 chips = new GroceryItemOrder2("chip", 2, 4.00);

        GroceryList2 groceryList = new GroceryList2();

        groceryList.add(apples);
        groceryList.add(bananas);
        groceryList.add(cookies);
        groceryList.add(tomatoes);
        groceryList.add(chips);

        groceryList.reportGrocery();


    }

}
