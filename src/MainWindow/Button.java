package MainWindow;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import StartingWindow.Frame;
import StartingWindow.TextFieldURL;
import Web.WebSite;

public class Button extends JButton implements ActionListener {
    
    Button(){
        this.setBounds(20, 20, 20, 20);
        this.addActionListener(this);
        this.setText("Confirm");
        this.setSize(WIDTH, HEIGHT);
        this.setLocation(345, 0);
        this.setBorderPainted(true);
        this.setBackground(new Color(218, 218, 218));
        this.setForeground(new Color(0, 0, 0));
        this.setFont(new Font("Consolas", Font.BOLD, 14));
        this.setFocusable(false);
        this.addActionListener(this);

    }
public void actionPerformed(ActionEvent e){
    if(e.getSource()== this){
  MainWindow.Frame.openStartingWindow();





}
    
}
}
