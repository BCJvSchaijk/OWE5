/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvink2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Afvink2 extends JFrame
    implements ActionListener {
    private JButton button;
    private JPanel panel;
    private JTextField xfield, yfield;
    private JLabel xlabel, ylabel;
    
public static void main(String[] args) {
Afvink2 frame = new Afvink2();
frame.setSize(800, 700);
frame.createGUI();
frame.setVisible(true);
}
private void createGUI() {
setDefaultCloseOperation(EXIT_ON_CLOSE);
Container window = getContentPane();
window.setLayout(new FlowLayout() );
panel = new JPanel();
panel.setPreferredSize(new Dimension(800, 600));
panel.setBackground(Color.white);
window.add(panel);
xlabel = new JLabel("X");
xfield = new JTextField();
xfield.setPreferredSize(new Dimension(70, 40));
window.add(xlabel);
window.add(xfield);
ylabel = new JLabel("Y");
yfield = new JTextField();
yfield.setPreferredSize(new Dimension(70, 40));
window.add(ylabel);
window.add(yfield);
xfield.addActionListener(this);
yfield.addActionListener(this);
button = new JButton("Maak water");
window.add(button);
button.addActionListener(this);
}
public void actionPerformed(ActionEvent event) {
Graphics paper = panel.getGraphics();
int xcoord;
int ycoord;
String xcoordInput;
String ycoordInput;
xcoordInput = xfield.getText();
ycoordInput = yfield.getText();
xcoord = Integer.parseInt(xcoordInput);
ycoord = Integer.parseInt(ycoordInput);
paper.setColor(Color.white);
paper.fillRect(0, 0, 800, 600);
paper.setColor(Color.black);
paper.drawLine(xcoord+80, ycoord+80, xcoord-50, ycoord-50);
paper.drawLine(xcoord+80, ycoord+80, xcoord+210, ycoord-50);
paper.setColor(Color.blue);
paper.fillOval(xcoord, ycoord, 160, 160);
paper.setColor(Color.red);
paper.fillOval(xcoord-100, ycoord-100, 100, 100);
paper.fillOval(xcoord+160, ycoord-100, 100, 100);
}
}
