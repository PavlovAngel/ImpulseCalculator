package Frame.MainWindow.MenuBar.MenuFile;

import Frame.MainWindow.MainFrame;
import Frame.MainWindow.TextAreas.NameTextArea;
import Frame.MainWindow.TextAreas.IdTextArea;
import Frame.MainWindow.TextAreas.QuantityTextArea;

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
        }
    }


}
