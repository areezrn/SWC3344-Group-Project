/**
/**
 * Group Project Data Structure(s)
 *
 * @MUHAMMAD AMIERUL SYAFIQ BIN GHAZALI
 * @MUHAMMAD KAMIL BIN BABDUL HALIM
 * @NUR ATHIRA BINTI NOOR ZAINAL
 * @NURMIZA BINTI SHAHRULNIZA
 * @NUR AMIRAH MIRZA BINTI IBRAHIM
 * 
 * @1 July 2022
 */

/**
 * 
 */

public class ItemInformation
{
        
    private CustomerInformation custinfo;
    private String itemId;
    private String itemName;
    private int itemQuantity;
    private double itemPrice;
    
    
    
    public ItemInformation()
    {
        itemId=null;
        itemName=null;
        itemPrice=0;
        itemQuantity=0;
    }   
    
    //Normal Constructor
    public ItemInformation(String ii,String in,double ip,int iq)
    {
        itemId=ii;
        itemName=in;
        itemPrice=ip;
        itemQuantity=iq;
    }
    
    //Mutator/Setter for Data ItemInformation
    public void ItemInformation(String ii,String in,double ip,int iq)
    {
        itemId=ii;
        itemName=in;
        itemPrice=ip;
        itemQuantity=iq;
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
