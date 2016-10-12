/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author oop
 */
public class Date extends JInternalFrame
{
    private JScrollBar año, mes, dia;
    private JButton mostrar;
    private JLabel laño, lmes, ldia;
    //--------------------------------------------------------------------------
    public Date()
    {
        super("Date",false,true,false,false);
        setSize(300, 200);
        widgets();
        events();
        setVisible(true);  
    }
    
    //--------------------------------------------------------------------------
    
    private void widgets()
    {
        JPanel p1 = new JPanel(new GridLayout(3, 1));
        JPanel p2 = new JPanel(new GridLayout(3, 1));
        JPanel p4 = new JPanel(new GridLayout(2, 1));
        JPanel p3 = new JPanel(new BorderLayout());
        mostrar = new JButton();
        año = new JScrollBar(JScrollBar.HORIZONTAL, 2000, 1, 1986, 2056);
        mes = new JScrollBar(JScrollBar.HORIZONTAL, 6, 1, 1, 12);
        dia = new JScrollBar(JScrollBar.HORIZONTAL, 15, 1, 1, 31);
        p1.add(new JLabel("Year"));
        p1.add(new JLabel("Moth"));
        p1.add(new JLabel("Day"));
        p2.add(año); 
        p2.add(mes);
        p2.add(dia);
        
        p3.add(p1, BorderLayout.WEST);
        p3.add(p2, BorderLayout.CENTER);
        p4.add(p3);
        p4.add(mostrar);
        add(p4);
         
        
    }
    
    //--------------------------------------------------------------------------
    
    private void events()
    {
        
        mostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int r = año.getValue();
                int g = mes.getValue();
                int b = dia.getValue();               
                mostrar.setText(""+b+" de "+""+g+" de "+""+r);             
            }
        });
    }    
}
