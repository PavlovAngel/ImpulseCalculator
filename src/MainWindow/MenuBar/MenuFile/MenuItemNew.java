package MainWindow.MenuBar.MenuFile;

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

            MainWindow.Frame.openStartingWindow();
        }
    }


}
