import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Counter1 extends JFrame implements ActionListener ,  ItemListener
{
	private JPanel pnlMenu, pnlButton, pnlName ;
	private JButton btnNext, btnDisplay, btnBack;
	private JLabel lblNewLabel;
	private BorderLayout layout ;
	private Container cont ;
	
	Counter2 c2;
	Counter1 c1;
	Frame1 f1;
	Main ma;
	
	
	
	//SETUP GUI
	public Counter1 ()
	{
		
		layout = new BorderLayout();
		
		new Font ("Serif" , Font.PLAIN , 18);
		Font myFont1 = new Font ("Monospaced" , Font.BOLD , 22);
		
		//getcontent pane and sets its layout
		cont = getContentPane();
		cont.setLayout(layout);
		cont.setBackground(new Color(255, 182, 193));
		
		
		//setup panel
		pnlMenu = new JPanel ();
		pnlMenu.setBackground(new Color(255, 192, 203));
		pnlButton = new JPanel ();
		pnlButton.setBackground(new Color(255, 192, 203));
		pnlName = new JPanel ();
		pnlName.setBackground(new Color(255, 192, 203));
		pnlMenu.setBorder(new TitledBorder (new EtchedBorder (), "LIST"));
		pnlName.setBorder(new TitledBorder (new EtchedBorder (), "COUNTER NUMBER"));
		
		//add component to container
		cont.add(pnlName , BorderLayout.NORTH);
		pnlName.setLayout(new BoxLayout(pnlName, BoxLayout.X_AXIS));
		
		lblNewLabel = new JLabel("Counter 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		pnlName.add(lblNewLabel);
		cont.add(pnlMenu , BorderLayout.CENTER);
		pnlMenu.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnDisplay = new JButton("Display");
		btnDisplay.setFont(new Font("Monospaced", Font.BOLD, 22));
		btnDisplay.setBackground(Color.ORANGE);
		pnlMenu.add(btnDisplay);
		
		cont.add(pnlButton , BorderLayout.SOUTH);
		
	
		
		//setup button
		btnNext = new JButton ("Next Counter");
		btnNext.setFont(myFont1);
		btnNext.setBackground(Color.yellow);
		btnBack = new JButton("Back");
		btnBack.setFont(myFont1);
		btnBack.setBackground(Color.orange);
		pnlButton.add(btnNext);
		pnlButton.add(btnBack);
		btnNext.addActionListener(this);
		btnDisplay.addActionListener(this);
		btnBack.addActionListener(this);
		
		
		
		//setup frame
		 this.setAlwaysOnTop(true);
	     this.setResizable(false);
	     setSize (400, 400);
	     this.setLocationRelativeTo(null); 
	     setVisible (true);
	     setDefaultCloseOperation (EXIT_ON_CLOSE);		
	} //SETUP END

	
	 public void actionPerformed(ActionEvent e) {
    	 int CounterNumber = 0;
    	    
    	//create an ArrayList object to contain objects of ItemInformation class
 	    ArrayList < ItemInformation > purchasedItemList = new ArrayList<ItemInformation>();
 	    
 	    //create an LinkedList object to contain objects of CustomerInformation class
 	    LinkedList < CustomerInformation > customerList = new  LinkedList<CustomerInformation>();
 	    
 	    //Create Queue for Fastcounter and Longcounter to get the counter number for customer
 	    Queue < Integer > FastCounter = new LinkedList<Integer>();
 	    Queue < Integer > LongCounter = new LinkedList<Integer>();
 	    
 	    //Add counter number into Queue
 	    FastCounter.add(1);
 	    FastCounter.add(2);
 	    LongCounter.add(3);
    	Queue < CustomerInformation > qCounter1 = new  LinkedList<CustomerInformation>();
  	    Queue < CustomerInformation > qCounter2 = new  LinkedList<CustomerInformation>();
  	    Queue < CustomerInformation > qCounter3 = new LinkedList<CustomerInformation>();
  	 
  	    BufferedReader br = null;
		
  	    try 
		{
			br = new BufferedReader(new FileReader("Info.txt"));
		} 
  	    
  	    catch (FileNotFoundException e1) 
  	    {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  	   
  	    //Read line from file
  	    String line = null;
		try 
		{
			line = br.readLine();
		} 
		
		catch (IOException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  	    for (int i = 0; i < 100; i++) {

  	      StringTokenizer st = new StringTokenizer(line, ";");
  	      String ci = st.nextToken();
  	      String cc = st.nextToken();
  	      String ii = st.nextToken();
  	      String in = st.nextToken();
  	      int iq1 = Integer.parseInt(st.nextToken());
  	      double ip1 = Double.parseDouble(st.nextToken());
  	      String dp = st.nextToken();
  	      
  	      //Remove counter number from Queue into Variable
  	      if (iq1 <= 5) 
  	      {

  	        CounterNumber = FastCounter.poll();

  	      } else 
  	      {

  	        CounterNumber = LongCounter.poll();

  	      }
  	      

  	      //Add variables into Objects
  	      CustomerInformation obj = new CustomerInformation(ci, cc, CounterNumber,ii, in , ip1, iq1,dp);
  	      //Add Objects into ArrayList/LinkedList
  	      customerList.add(obj);
  	      ItemInformation obj1 = new ItemInformation(ii, in , ip1, iq1,dp);
  	      purchasedItemList.add(obj1);
  	      
  	      //Add Object into Queue based on the counter number
  	      if (obj.getCounterPaid() == 1) 
  	      {

  	        qCounter1.add(obj);

  	      } //End of if

  	      else if (obj.getCounterPaid() == 2) 
  	      {

  	        qCounter2.add(obj);

  	      } //End of else if
  	     
  	      else 
  	      {

  	        qCounter3.add(obj);

  	      }//End of else
  	      
  	      
  	      //Add the counter number again int the Queue
  	     
  	      if (iq1 <= 5) {

  	        FastCounter.add(CounterNumber);

  	      } //End of if
  	      
  	      else 
  	      {

  	        LongCounter.add(CounterNumber);
  	      }
  	      try 
  	      {
			line = br.readLine();
  	      } 
  	      catch (IOException e1) 
  	      {
			// TODO Auto-generated catch block
			e1.printStackTrace();
  	      }
  	    }
  	    
  	    //BUTTON FUNCTION
  	  if(e.getSource()== btnDisplay)
  	  {
  		 int qSize1 = qCounter1.size();
  	 
  	    //Print Information For Each Data
  	    System.out.println("============");
  	    System.out.println("Counter #1");
  	    System.out.println("============\n");
  	    
  	    //Print Counter1 Details
  	    for (int i = 0; i < qSize1; i++)
  	    {

  	      System.out.println("+-------------+");
  	      System.out.println("|Customer #" + (i + 1)+" |");
  	      System.out.println("+-------------+");
  	      System.out.println(qCounter1.poll());
  	    }
  	 }
  	  else if(e.getSource()== btnNext)
		{
			c2 = new Counter2();
			dispose ();
		}	
  	
  	  else if(e.getSource()== btnBack)
	{
		f1 = new Frame1();
		dispose ();
	}	
 }
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub		
	}
}