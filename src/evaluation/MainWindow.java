/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Juan Pablo Lagos 
 */
public class MainWindow extends JFrame
{
    private JMenuBar menu;
    private JMenu app,help;
    private JMenuItem date, book, about;
    private JDesktopPane mdi;
    private int index=1;
    
    //--------------------------------------------------------------------------
    
    public MainWindow()
    {
        super("Evaluation");
        setSize(600, 400);
        widgets();
        events();
        setVisible(true);       
        
    }
    
    //--------------------------------------------------------------------------
    
    private void widgets()
    {
        menu = new JMenuBar();
        app = new JMenu("Apps");
        help = new JMenu("Help");
        date = new JMenuItem("Date");
        book = new JMenuItem("Books");
        about = new JMenuItem("Abaout");
        mdi = new JDesktopPane();
        
        setJMenuBar(menu);
        menu.add(app);
        menu.add(help);        
        app.add(date);
        app.addSeparator();
        app.add(book);
        
        help.add(about);
        
        add(mdi);     
    }
    
    //--------------------------------------------------------------------------
    
    private void events()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //----------------------------------------------------------------------
        date.addActionListener(new ActionListener() {            
            public void actionPerformed(ActionEvent e) {
                mdi.add(new Date());
            }
        });
        //----------------------------------------------------------------------
        book.addActionListener(new ActionListener() {            
            public void actionPerformed(ActionEvent e) {
                mdi.add(new Books());
                mdi.add(new BooksDisable());         
                               
            }
        }); 
        //----------------------------------------------------------------------
        about.addActionListener(new ActionListener() {            
            public void actionPerformed(ActionEvent e) {
                mdi.add(new About());
            }
        });       
        
    }  
    
    //--------------------------------------------------------------------------
    
    public static void main(String[] args) 
    {
        new MainWindow();
    }
    
}
