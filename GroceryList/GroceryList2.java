package Assignments.GroceryList;

// This class keeps track of a grocery list of items

public class GroceryList2 {
    public static final int MAX_ITEMS = 10;

    private GroceryItemOrder2[] items;

    private int numItems;

    public GroceryList2() 
    {
        items = new GroceryItemOrder2[MAX_ITEMS];
        numItems = 0;
    }

    public void add(GroceryItemOrder2 item) 
    {
        items[numItems] = item;
        numItems++;
    }

    public double getTotalCost() 
    {
        double cost = 0.0;
        for (int i = 0; i < numItems; i++) 
        {
            cost += items[i].getCost();
        }
        return cost;
    }
    
    // Joe - Added this item
    public void displayItems() 
    {
        
        for (int i = 0; i < numItems; i++) 
        {
        	System.out.println(items[i].toString() + " " + items[i].getCost());
        	
        }

    }

    public void reportGrocery(){

        displayItems();

        System.out.println("total cost: " + getTotalCost());
    }

    
}
