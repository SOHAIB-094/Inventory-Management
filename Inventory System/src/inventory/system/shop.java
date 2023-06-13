package inventory.system;

import java.util.*;

public class shop
{
    private int item_no;
    private String item_name;
    private int item_price;
    
    // getter and setter
    
    public void setNo(int no)
    {
        this.item_no = no;
    }
    
    public int getNo()
    {
        return this.item_no;
    }
    
    public void setName(String name)
    {
        this.item_name = name;
    }
    
     public String getName()
    {
        return this.item_name;
    }
     
    public void setPrice(int price)
    {
        this.item_price = price;
    }
    
    public int getPrice()
    {
        return this.item_price;
    }
    
    
    // Methods
    
    public void addNewItem(shop s)
    {
        this.item_name = s.item_name;
        this.item_no = s.item_no;
        this.item_price = s.item_price;
    }
    
    public void displayItems(ArrayList<shop> arr)
    {
        System.out.println("\n\n");
        if (arr.isEmpty())
        {
            System.out.println("No Item...");
            return;
        }
        System.out.println("Item No\t\tItem Name\t\tItem Price");
        System.out.println("------------------------------------------------------------------------------------------------------");

        for (shop shop1 : arr)
        {
            System.out.println(shop1.item_no +"\t\t" + shop1.item_name + "\t\t" + shop1.item_price);       
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        
        System.out.println("\n\n");
    }
    
}
