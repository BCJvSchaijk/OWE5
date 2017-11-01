/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owe5bartvschaijkkans1;

import java.awt.Dimension;
import static java.awt.SystemColor.window;
import javax.swing.*;

/**
 *
 * @author bart
 */
public class OWE5BartvSchaijkKans1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        createGUI();
        private static void createGUI() {
            createGUI frame; 
            //Jframe frame;
            frame = new JFrame();
            frame.createGUI();
            frame.setVisible(true);
            JPanel panel = new JPanel();
            panel.setPreferredSize(new Dimension(100,100));
            window.add(panel);
            JButton button = new JButton('klik');
            window.add(button);
            textField = new JTextfield('textfield');
    }
    }
    
}
