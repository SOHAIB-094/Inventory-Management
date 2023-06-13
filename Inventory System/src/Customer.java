
public class Customer 
{
    private int customer_id;
    private String customer_name;
    private int purchase_qty;
    private int item_no;

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

    public int getItem_no() {
        return item_no;
    }

    public void setItem_no(int item_no) {
        this.item_no = item_no;
    }

    
    
    
    
    
    
}
