package Frame.ErrorWindow;
import Frame.MainWindow.MainFrame;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ErrorWindow extends JOptionPane {

    static JFrame f;

        ErrorWindow() {
        this.setBounds(20, 20, 20, 20);
           //showMessageDialog(f,"Product ","Alert",JOptionPane.WARNING_MESSAGE);
            f=new JFrame();

    }

    public static void checkInBoxQuantity(){

            new ErrorWindow();
            showMessageDialog(f, "Input quantity in one box!", "Error",JOptionPane.WARNING_MESSAGE);

    }
    public static void checkDataBase(){
        showMessageDialog(f, "Product is not in database!", "Error",JOptionPane.WARNING_MESSAGE);
    }


}
