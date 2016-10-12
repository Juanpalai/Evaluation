/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluation;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;

/**
 *
 * @author oop
 */
public class About extends JInternalFrame
{
    
    private JButton universidad, carrera, nombre;
    //--------------------------------------------------------------------------
            
    public About()
    {
        super("About of me",false,true,false,false);
        setSize(300, 300);
        widgets();
        events();
        setVisible(true);       
        
    }
    
    //--------------------------------------------------------------------------
    
    private void widgets()
    {
        setLayout(new GridLayout(3, 1));
        universidad = new JButton();
        carrera = new JButton();
        nombre = new JButton();
        add(universidad); 
        
    }
    
    //--------------------------------------------------------------------------
    
    private void events()
    {
        universidad.addActionListener(new ActionListener() {            
            public void actionPerformed(ActionEvent e) {
                universidad.setText("Universidad de Nariño");                                
                add(carrera);    
                
            }
        });
        carrera.addActionListener(new ActionListener() {            
            public void actionPerformed(ActionEvent e) {
                carrera.setText("Ingenieria de Sistemas");                                
                add(nombre);    
                
            }
        });
        nombre.addActionListener(new ActionListener() {            
            public void actionPerformed(ActionEvent e) {
                nombre.setText("Juan Pablo Lagos");
                
            }
        });
        
    }
}