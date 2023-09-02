package Frame.MainWindow;

import Frame.MainWindow.MenuBar.MenuBar;
import Frame.ChangeTheme;
import Frame.StartingWindow.StartingFrame;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class MainFrame extends JFrame {
    static final int WIDTH = 450;
    static final int HEIGHT = 300;
    static final int X = 1200;
    static final int Y = 300;
    static final String mainWindowsName = "Main Window";
    public static MainFrame mainframe;

    public MainFrame() throws UnsupportedLookAndFeelException {
        this.setBounds(X, Y, WIDTH, HEIGHT);
        this.setTitle(mainWindowsName);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.add(new Panel());
        this.add(new MenuBar());
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        MetalLookAndFeel.setCurrentTheme(new ChangeTheme());
        UIManager.setLookAndFeel(new MetalLookAndFeel());
        SwingUtilities.updateComponentTreeUI(this);
        this.setVisible(true);

    }


    public static void openWindow() throws UnsupportedLookAndFeelException {
        mainframe = new MainFrame();

    }

    public static void openStartingWindow() {
        mainframe.dispose();
        StartingFrame.unHideWindow();
    }


}

