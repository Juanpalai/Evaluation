/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluation;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JList;

/**
 *
 * @author oop
 */
public class BooksDisable extends JInternalFrame
{
    private JList disable;
    private JButton retur;
    //--------------------------------------------------------------------------
    
    public BooksDisable()
    {
        super("Disable",false,true,false,false);
        setSize(200, 300);
        widgets();
        events();
        setVisible(true);       
        
    }
    
    //--------------------------------------------------------------------------
    
    private void widgets()
    {
        disable = new JList();
        retur = new  JButton("Redturn");
        add(disable, BorderLayout.CENTER);
        add(retur, BorderLayout.SOUTH);
        
    }
    
    //--------------------------------------------------------------------------
    
    private void events()
    {
        
    }
}