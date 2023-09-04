package Frame.MainWindow.MenuBar;

import Frame.MainWindow.MenuBar.MenuEdit.MenuEdit;
import Frame.MainWindow.MenuBar.MenuFile.MenuFile;
import Frame.MainWindow.MenuBar.MenuHelp.MenuHelp;
import Frame.MainWindow.MenuBar.MenuOptions.MenuOptions;
import Frame.MainWindow.MenuBar.MenuView.MenuView;

import javax.swing.*;
import java.awt.*;

public class MenuBar extends JMenuBar {


public MenuBar(){
this.setBounds(0,0,450,20);
        this.add( new MenuFile());
        this.add(new MenuEdit());
        this.add(new MenuView());
        this.add(new MenuOptions());
        this.add(new MenuHelp());
        //this.setBackground(new Color(255, 255, 255, 169));
       // this.setLayout(new GridLayout());
    }
}
