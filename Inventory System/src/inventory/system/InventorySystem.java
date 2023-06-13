package inventory.system;

import java.util.ArrayList;
import java.util.Scanner;

// inventory system
public class InventorySystem 
{
    private static Scanner sc;
    private static final ArrayList<Customer> cusList = new ArrayList<>();
    private static final ArrayList<shop> shopList = new ArrayList<>();
    
    static void menu()
    {
        System.out.println("--------------------------------------------------------------------------------------------");        
        System.out.println("************ INVENTORY MANAGEMENT SYSTEM *************");        
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("\t  What do you like to Select? ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(" Enter 1 to Add an Item ");
        System.out.println(" Enter 2 to Display Items ");
        System.out.println(" Enter 3 to Add Customer Details ");
        System.out.println(" Enter 0 to EXIT the System ");
        System.out.println("\n-----------------------------------------------------------------------------------------------");
    }
 
    public static void main(String[] args) 
    {
        int opt;
        Scanner sc = new Scanner (System.in);
       
        do 
        {
            shop s = new shop();
            menu();
            opt = sc.nextInt();
            switch (opt)
            {
                case 1:
                    System.out.println("\n-----------------------------------------------------------------------------------------------------------");
                    System.out.println("\t\tPersonal Space Inventory");
                    System.out.println("-----------------------------------------------------------------------------------------------------------");
                    System.out.println("Item No\t\t   Item Name\t\t\tItem Price");
                    System.out.println("----------\t\t-------------------------------\t\t----------------");
                    System.out.println("|    01     |\t\t|   Chair                         |\t\t|     250 $     |");
                    System.out.println("|    02     |\t\t|   Table                         |\t\t|     999 $     |");
                    System.out.println("|    03     |\t\t|   Arm Chair                  |\t\t|     850 $     |");
                    System.out.println("|    04     |\t\t|   Side Table                  |\t\t|     400 $     |");
                    System.out.println("|    05     |\t\t|   Lamp                         |\t\t|     159 $     |");
                    System.out.println("|    06     |\t\t|   Rugs                          |\t\t|     275 $     |");
                    System.out.println("|    07     |\t\t|   Curtains                     |\t\t|     220 $     |");
                    System.out.println("|    08     |\t\t|   Sofa                          |\t\t|     4500 $   |");
                    System.out.println("|    09     |\t\t|   Bookcases                 |\t\t|     375 $     |");
                    System.out.println("|    10     |\t\t|   Antique Frames          |\t\t|     110 $     |");
                    System.out.println("|    11     |\t\t|   Cabinet                      |\t\t|     435 $     |");
                    System.out.println("|    12     |\t\t|   Entertainment System |\t\t|      799 $    |");
                    System.out.println("|    13     |\t\t|   Bed Frame                 |\t\t|     1359 $   |");
                    System.out.println("|    14     |\t\t|   Mattress                     |\t\t|     1100 $   |");
                    System.out.println("|    15     |\t\t|   Smart Television         |\t\t|     1899 $   |");                    
                    System.out.println("-----------------------------------------------------------------------------------------------------------");
                    System.out.println("Enter Item No:    ");
                    s.setNo(sc.nextInt());
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("Enter Item Name:  ");
                    sc = new Scanner(System.in);
                    s.setName(sc.nextLine());
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("Enter Item Price: ");
                    s.setPrice(sc.nextInt());
                    System.out.println("--------------------------------------------------------------------------------------------");
                    s.addNewItem(s);
                    shopList.add(s);
                    break;
                    
                case 2:
                    /*System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");*/

                    s.displayItems(shopList);
                    break;
                    
                case 3:
                    _sellOutDetails();
                    break;
            }    
        } while (opt != 0);        
    }
    
    private static void _sellOutDetails()
    {
        Scanner sc = new Scanner(System.in);
        Customer c = new Customer();
        
        System.out.println("\n\n--------------------------------");
        System.out.println("Enter Customer Name: ");
        c.setCustomer_name(sc.nextLine());
        System.out.println("----------------------------");
        System.out.println("Enter Item No:       ");
        c.setItem_no(sc.nextInt());
        System.out.println("----------------------------");
        System.out.println("Enter Item Qty:      ");
        c.setPurchase_qty(sc.nextInt());
        System.out.println("----------------------------");
        c.addCustomerDetails(c);
        cusList.add(c);
        
        System.out.println("Do you have more items to add? (Yes/No)");
        String choice = "";
        sc.next();
        if (choice.contains("yes"))
        {
            // again input and update data of customer
            _sellOutDetails();
        }
        else
        {
            // display bill
            c.displayCustomerBill(cusList, c.getCustomer_name(), shopList);
        }
             
    }
}
