package Frame.MainWindow.MenuBar.MenuFile;

import Data.Calculator;
import Data.Products;
import Frame.MainWindow.MainFrame;
import Frame.MainWindow.TextAreas.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuItemNew extends JMenuItem implements ActionListener {
    public MenuItemNew() {
        this.setText("New");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {

            MainFrame.openStartingWindow();
            QuantityTextArea.textArea.setText("");
            IdTextArea.textArea.setText("");
            NameTextArea.textArea.setText("");
            CurrentBoxQuantity.textArea.setText("");
            WeightTextArea.textArea.setText("");
            Products.totalWeight = 0.0;
            Calculator.currentBoxes = 0;
            Calculator.finalBoxes = 0;
        }
    }


}
