package Frame.MainWindow;

import Frame.MainWindow.Labels.DescriptionLabel;
import Frame.MainWindow.Labels.IdLabel;
import Frame.MainWindow.Labels.QuantityLabel;
import Frame.MainWindow.Labels.WeightLabel;
import Frame.MainWindow.Labels.WeightLabel;
import Frame.MainWindow.TextAreas.IdTextArea;
import Frame.MainWindow.TextAreas.NameTextArea;
import Frame.MainWindow.TextAreas.QuantityTextArea;
import Frame.MainWindow.TextAreas.WeightTextArea;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    static final int WIDTH = 450;
    static final int HEIGHT = 300;
    static final int X = 0;
    static final int Y = 20;


    Panel() {
        this.setBounds(X, Y, WIDTH, HEIGHT);
        this.add(QuantityTextArea.textArea);
        this.add(new Button());
        this.add(IdTextArea.textArea);
        this.add(NameTextArea.textArea);
        this.add(WeightTextArea.textArea);
        this.setBackground(new Color(0, 0, 0, 44));
        this.add(new IdLabel());
        this.add(new QuantityLabel());
        this.add(new DescriptionLabel());
        this.add(new WeightLabel());
        this.setLayout(null);




    }



}
