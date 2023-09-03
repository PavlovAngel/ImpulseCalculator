package Frame.StartingWindow;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

import Data.Details;
import Frame.ChangeTheme;
import Frame.MainWindow.MainFrame;

import java.awt.*;

public class StartingFrame extends JFrame {
    static final int WIDTH = 450;
    static final int HEIGHT = 100;
    static final int X = 1200;
    static final int Y = 300;
    static final String startingWindowsName = "URL Window";
    private static StartingFrame frame;

    public StartingFrame() throws UnsupportedLookAndFeelException {
        this.setBounds(X, Y, WIDTH, HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle(startingWindowsName);
        this.add(new Button());
        this.add(TextFieldURL.textField);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        MetalLookAndFeel.setCurrentTheme(new ChangeTheme());
        UIManager.setLookAndFeel(new MetalLookAndFeel());
        SwingUtilities.updateComponentTreeUI(this);
        this.setVisible(true);

    }


    public static void openWindow() throws UnsupportedLookAndFeelException {
        frame = new StartingFrame();


    }

    public static void openMainWindow() throws UnsupportedLookAndFeelException {
        hideWindow();
        MainFrame.openWindow();
        Details.setidLine();
        Details.setID();
    }

    public static void hideWindow() {
        frame.setVisible(false);
    }

    public static void unHideWindow() {
        frame.setVisible(true);
    }
}
