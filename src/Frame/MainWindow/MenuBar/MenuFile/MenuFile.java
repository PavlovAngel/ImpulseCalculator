package Frame.MainWindow.MenuBar.MenuFile;

import javax.swing.*;

public class MenuFile extends JMenu {
    public MenuFile(){
        this.setText("File");
        this.add(new MenuItemNew());
    }
}
