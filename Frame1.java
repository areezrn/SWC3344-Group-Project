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
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Queue;
import java.awt.Toolkit;
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

//step 1
public class Frame1 extends JFrame implements ActionListener
{
    private JLabel lbl1,lbl2, lblImage1;
    private JButton btnNext;
    private JPanel pnlMenu;
    private Container cont;
    private BorderLayout layout;
    
    //Set up GUI
    public Frame1 ()
    {
        super ("AEON Hypermarket");
        setBackground(Color.WHITE);
        layout = new BorderLayout();
        
        //set Font
        Font myFont2 = new Font ("Helvetica",Font.BOLD+Font.ITALIC,20);
        
        //get content pane and sets its layout
        cont = getContentPane();
        cont.setLayout(layout);
        cont.setBackground(new Color(139, 0, 139));
        
        //set up Label
        lbl1 = new JLabel ("                         Welcome To");
        lbl1.setForeground(new Color(255, 255, 255));
        lbl2 = new JLabel ("                AEON Hypermarket");
        lbl2.setForeground(new Color(255, 255, 255));
        lbl1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 20)); 
        lbl2.setFont(new Font("Russo One", Font.BOLD, 20));
        ImageIcon icon = new ImageIcon (new ImageIcon ("AEON.JFIF").getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT));
        lblImage1 = new JLabel (icon);
        lblImage1.setBackground(Color.GREEN);
        
        //set up button
        btnNext = new JButton ("Proceed");
        btnNext.setFont(myFont2);
        btnNext.setBackground(Color.PINK);
        btnNext.addActionListener(this);
        
        
        //set up Panel
        pnlMenu = new JPanel ();
        pnlMenu.setLayout(new GridLayout (3, 2));
        pnlMenu.setBackground(new Color(139, 0, 139));
        
        pnlMenu.add(lbl1);
        pnlMenu.add(lbl2);
        
        //add components to container
        cont.add(pnlMenu , BorderLayout.NORTH);
        cont.add(lblImage1 , BorderLayout.CENTER);
        cont.add(btnNext , BorderLayout.SOUTH);
        
        //set up frame
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        setSize (400, 400);
        this.setLocationRelativeTo(null); 
        setVisible (true);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
    }
    
     public void actionPerformed(ActionEvent e) {
   
          
  	    if(e.getSource()==btnNext) 
          {
 
        	    new Counter1();
        	    dispose ();
          }
    }
}


