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


public class CustomerInformation
{
        
    
    private String custId;
    private String custIC;
    private int CounterPaid;
    
    
    public CustomerInformation()
    {
        custId=null;
        custIC=null;
        CounterPaid=0;
    }   
    
    //Normal Constructor
    public CustomerInformation(String cd,String cc,int cp)
    {
        custId=cd;
        custIC=cc;
        CounterPaid=cp;
    }
    
    //Mutator/Setter for Data CustomerInformation
       public void setCustomerInformation(String cd,String cc,int cp)
    {
        custId=cd;
        custIC=cc;
        CounterPaid=cp;
    }
    
    //Accessor/Getter for Customer ID
    public String getCustId(){
    
        return custId;
    
    }
    
    //Accessor/Getter for Customer IC
    public String getCustIC () {
        
        return custIC;
        
    }
    
    //Accessor/Getter for Counter Paid
    public int getCounterPaid (){

        return CounterPaid;
    
    }
    
   //toString()Method
    public String toString()
    {
        return("Customer ID:"+custId+"\nCustomer IC: "+custIC);
    }
    }
