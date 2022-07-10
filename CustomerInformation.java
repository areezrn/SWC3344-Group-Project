import java.awt.Graphics;
import java.awt.Point;

import javax.swing.event.ChangeListener;
import javax.swing.text.Caret;
import javax.swing.text.JTextComponent;

public class CustomerInformation implements Caret
{
        
    
    private String custId;
    private String custIC;
    private int CounterPaid;
    
    //Has-a relationship
    private ItemInformation iteminfo;
    
    //Constructor without parameter
    public CustomerInformation()
    {
        custId=null;
        custIC=null;
        CounterPaid=0;
    }   
    
    //Normal Constructor
    public CustomerInformation(String cd,String cc,int cp,String ii,String in,double ip,int iq,String dp)
    {
        custId=cd;
        custIC=cc;
        CounterPaid=cp;
        iteminfo=new ItemInformation(ii,in,ip,iq,dp);
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
        return("Customer ID:"+custId+"\nCustomer IC: "+custIC+"\nItem ID:"+iteminfo.getItemId()+"\nItem Name: "+iteminfo.getItemName()+"\nItem Quantity:"+iteminfo.getItemQuantity()+"\nItem Price:RM"+iteminfo.getItemPrice()+"\nDate Purchase:"+iteminfo.getDatePurchase()+"\nTotal Price:RM:"+iteminfo.TotalPrice()+"\n");
    }

	@Override
	public void install(JTextComponent c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deinstall(JTextComponent c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addChangeListener(ChangeListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeChangeListener(ChangeListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setVisible(boolean v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSelectionVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSelectionVisible(boolean v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMagicCaretPosition(Point p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Point getMagicCaretPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBlinkRate(int rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getBlinkRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDot() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMark() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDot(int dot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDot(int dot) {
		// TODO Auto-generated method stub
		
	}
    }
