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


import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Formatter;
import java.util.StringTokenizer;
import java.text.DecimalFormat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.Frame;

public class Main {
  public static void main(String[] args) throws IOException {
    
    int CounterNumber = 0;
    //create an ArrayList object to contain objects of ItemInformation class
    ArrayList < ItemInformation > purchasedItemList = new < ItemInformation > ArrayList();
    //create an LinkedList object to contain objects of CustomerInformation class
    LinkedList < CustomerInformation > customerList = new < CustomerInformation > LinkedList();
    //Create Queue for Fastcounter and Longcounter to get the counter number for customer
    Queue < Integer > FastCounter = new LinkedList();
    Queue < Integer > LongCounter = new LinkedList();
    //Add counter number into Queue
    FastCounter.add(1);
    FastCounter.add(2);
    LongCounter.add(3);
    //Declaring Queue for each counter
    Queue < ItemInformation > qCounter1 = new < ItemInformation > LinkedList();
    Queue < ItemInformation > qCounter2 = new < ItemInformation > LinkedList();
    Queue < ItemInformation > qCounter3 = new < ItemInformation > LinkedList();
    
    //Declaring GUI class and Object
    Frame1 GUIObj = new Frame1();
    GUIObj.GUI();

    try {
      Thread.sleep(5000);
    } catch (InterruptedException ie) {
      ie.printStackTrace();
    }
    
    //Use Formatter and BufferedReader to get Data from file
    Formatter formatter;
    DecimalFormat priceformatter = new DecimalFormat("#0.00");
    BufferedReader br = new BufferedReader(new FileReader("Info.txt"));
    formatter = new Formatter();
    //Read line from file
    String line = br.readLine();
    for (int i = 0; i < 100; i++) {

      StringTokenizer st = new StringTokenizer(line, ";");
      String ci = st.nextToken();
      String cc = st.nextToken();
      String ii = st.nextToken();
      String in = st.nextToken();
      int iq1 = Integer.parseInt(st.nextToken());
      double ip1 = Double.parseDouble(st.nextToken());
      
      //Remove counter number from Queue into Variable
      if (iq1 <= 5) {

        CounterNumber = FastCounter.poll();

      } else {

        CounterNumber = LongCounter.poll();

      }
      
      //Add variables into Objects
      CustomerInformation obj = new CustomerInformation(ci, cc, CounterNumber);
      //Add Objects into ArrayList/LinkedList
      customerList.add(obj);
      ItemInformation obj1 = new ItemInformation(ii, in , ip1, iq1);
      purchasedItemList.add(obj1);
      
      //Add Object into Queue based on the counter number
      if (obj.getCounterPaid() == 1) {

        qCounter1.add(obj1);

      } //End of if
      else if (obj.getCounterPaid() == 2) {

        qCounter2.add(obj1);

      } //End of else if
      else {

        qCounter3.add(obj1);

      }//End of else
      
      
      //Add the counter number again int the Queue
      if (iq1 <= 5) {

        FastCounter.add(CounterNumber);

      } //End of if
      else {

        LongCounter.add(CounterNumber);

      }//End of else

      line = br.readLine();
    }

    //Add Queue size into variable
    int qSize1 = qCounter1.size();
    int qSize2 = qCounter2.size();
    int qSize3 = qCounter3.size();
    
    //Print Information For Each Data
    System.out.println("============");
    System.out.println("Counter #1");
    System.out.println("============\n");
    
    //Print Counter1 Details
    for (int i = 0; i < qSize1; i++) {

      System.out.println("+-------------+");
      System.out.println("|Customer #" + (i + 1)+" |");
      System.out.println("+-------------+");
      CustomerInformation w = customerList.get(i);
      System.out.println(w.toString()); //Default toString belong to Object
      System.out.println(qCounter1.poll());

    } //End of for

    System.out.println("============");
    System.out.println("Counter #2");
    System.out.println("============\n");

    //Print Counter2 Details
    for (int i = 0; i < qSize2; ++i) {

      System.out.println("+-------------+");
      System.out.println("|Customer #" + (i + 1)+" |");
      System.out.println("+-------------+");
      CustomerInformation w = customerList.get(i);
      System.out.println(w.toString()); //Default toString belong to Object
      System.out.println(qCounter2.poll());

    }//End of for

    System.out.println("============");
    System.out.println("Counter #3");
    System.out.println("============\n");

    
    //Print Counter3 Details
    for (int i = 0; i < qSize3; ++i) {

      System.out.println("+-------------+");
      System.out.println("|Customer #" + (i + 1)+" |");
      System.out.println("+-------------+");
      CustomerInformation w = customerList.get(i);
      System.out.println(w.toString()); //Default toString belong to Object
      System.out.println(qCounter3.poll());

    }//End of for

  }//End of main
}//End of class