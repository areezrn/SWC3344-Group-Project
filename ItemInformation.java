

public class ItemInformation
{
    //Has a relationship    

    private String itemId;
    private String itemName;
    private int itemQuantity;
    private double itemPrice;
    private String datePurchase;
    
    
    //Constructor without parameter
    public ItemInformation()
    {
        itemId=null;
        itemName=null;
        itemPrice=0;
        itemQuantity=0;
        datePurchase=null;
    }   
    
    //Normal Constructor
    public ItemInformation(String ii,String in,double ip,int iq,String dp)
    {
        itemId=ii;
        itemName=in;
        itemPrice=ip;
        itemQuantity=iq;
        datePurchase=dp;
    }
    
    //Mutator/Setter for Data ItemInformation
    public void ItemInformation(String ii,String in,double ip,int iq,String dp)
    {
        itemId=ii;
        itemName=in;
        itemPrice=ip;
        itemQuantity=iq;
        datePurchase=dp;
    }
    
    //Accessor/Getter for Item ID
    public String getItemId(){
    
        return itemId;
    
    }
    
    //Accessor/Getter for Item Name
    public String getItemName () {
        
        return itemName;
        
    }
    
    //Accessor/Getter for Item Price
    public double getItemPrice (){

        return itemPrice;
    
    }
    
     //Accessor/Getter for Item Price
    public double getItemQuantity (){

        return itemQuantity;
    
    }
    
      //Accessor/Getter for Item Price
    public String getDatePurchase (){

        return datePurchase;
    
    }
    
    //Method for geting total price
    public double TotalPrice(){
        
        double total=itemPrice*itemQuantity;
        return total;
        
    }
    
   //toString()Method
    public String toString()
    {
        return("Item ID:"+itemId+"\nItem Name: "+itemName+"\nItem Quantity:"+itemQuantity+"\nItem Price:RM"+itemPrice+"\nTotal Price:RM"+TotalPrice()+"\n");
    }
    }
