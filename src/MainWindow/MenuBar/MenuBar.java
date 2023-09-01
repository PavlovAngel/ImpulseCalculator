package MainWindow.MenuBar;

import MainWindow.MenuBar.MenuFile.MenuFile;

import javax.swing.*;

public class MenuBar extends JMenuBar {


public MenuBar(){
this.setBounds(0,0,800,20);
        this.add( new MenuFile());
    }
}
