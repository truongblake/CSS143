package Assignments.GroceryList;

// This class stores information about a single grocery item being ordered.

public class GroceryItemOrder2 
{
    private String name;
    private int quantity;
    private double pricePerUnit;

    public GroceryItemOrder2(String name, int quantity, double pricePerUnit) 
    {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getCost() 
    {
        return quantity * pricePerUnit;
    }

    public void setQuanity(int quantity) 
    {
        this.quantity = quantity;
    }

    public String toString() 
    {
        return quantity + " of " + name;
    }
    
    // Joe - Added this method
    public String getItemName()
    {
       return this.name;	
    }	
    	
}
