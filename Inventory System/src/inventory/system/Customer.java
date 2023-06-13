package inventory.system;

import java.util.*;

public class Customer 
{
    
    private int customer_id;
    private String customer_name;
    private int purchase_qty;
    private int item_no;
    private float total_Bill; 

    // methods
    
    public void addCustomerDetails(Customer c)
    {
        this.customer_name = c.customer_name;
        this.item_no = c.item_no;
        this.purchase_qty = c.purchase_qty;
        
    }
    
    public void displayCustomerBill(ArrayList<Customer> arr , String cus_name, ArrayList<shop> shoplist)
    {
        float total = 0;
        System.out.println("\n\n\nItem No\t\tCustomer Name\t\tItem Quantity");
        System.out.println("------------------------------------------------------------------------------------------------------");



        
        for (Customer c : arr)
        {
            if (c.customer_name.equals(cus_name))
            {
        System.out.println(c.item_no +"\t\t" + c.customer_name + "\t\t\t" + c.purchase_qty);
            for (shop shop1 : shoplist)
            {
                if (shop1.getNo() == c.item_no)
                {
                    total += c.purchase_qty * shop1.getPrice();  
                }
                
            }
        
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------------");


        
        System.out.println("Total Bill Before Discount == " + total);
        float dis = 0;
        if (total < 200)
        {
            dis = (total*15) / 100;
        }
        else
        {    
            if (total >= 200 && total < 700)
        {
            dis = (total*25) / 100;
        }
        else
            if (total > 700)
            {
               dis = (total*50) / 100; 
            }
        System.out.println("\n\n------------------------------------------------------------------------------------------------------------------------");

    
        
        for (Customer cus : arr)
        {
            if (cus.getCustomer_name().equals(cus_name))
            {
                cus.settotal_Bill(total);
            }    
        }
        System.out.println("\n\n------------------------------------------------------------------------------------------------------------------------");

        }
        System.out.println("Total Bill After Discount == " + (total - dis));
    }
        
    
    // getters and setters
    
    public void setCustomer_id(int customer_id)
    {
        this.customer_id = customer_id;
    }
    
    public int getCustomer_id() 
    {
        return customer_id;
    }

    public void setCustomer_name(String customer_name) 
    {
        this.customer_name = customer_name;
    }

    public String getCustomer_name()
    {
        return customer_name;
    }

    public void setPurchase_qty(int purchase_qty) 
    {
        this.purchase_qty = purchase_qty;
    }

    public int getPurchase_qty()
    {
        return purchase_qty;
    }

    public void setItem_no(int item_no)
    {
        this.item_no = item_no;
    }

    public int getItem_no() 
    {
        return item_no;
    }

    public void settotal_Bill(float bill)
    {
        this.total_Bill = bill;
    }
    
    public float gettotal_Bill() 
    {
        return customer_id;
    }
}    
    
    
    
    
    

