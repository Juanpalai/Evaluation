/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluation;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JList;

/**
 *
 * @author oop
 */
public class Books extends JInternalFrame
{
    private JList enable;
    private JButton lend;
    //--------------------------------------------------------------------------
    
    
    public Books()
    {
        super("Enable",false,true,false,false);
        setSize(200, 300);
        widgets();
        events();
        setVisible(true);       
        
    }
    
    //--------------------------------------------------------------------------
    
    private void widgets()
    {
        enable = new JList();
        lend = new  JButton("Lend");
        add(enable, BorderLayout.CENTER);
        add(lend, BorderLayout.SOUTH);
    }
    
    //--------------------------------------------------------------------------
    
    private void events()
    {
        for(int i=0; i<7; i++)
        {
            
        }
        
    }
}