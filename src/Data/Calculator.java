package Data;

import Frame.ErrorWindow.ErrorWindow;
import Frame.MainWindow.MainFrame;
import Frame.MainWindow.TextAreas.CurrentBoxQuantity;
import Frame.MainWindow.TextAreas.TotalBoxTextArea;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;

public class Calculator {
    public static int finalBoxes;
    public static int currentBoxes;

    public static void calculate() {
        int detailPcsInBox;
        int boxes;
        int boxWeight = 0;
        int orderQuantity = Integer.parseInt(Products.getOrderQuantity());
        int left;
        String myString;
        String boxCounter;
        try {

            detailPcsInBox = Integer.parseInt(Products.getInBoxQuantity());
            boxes = orderQuantity / detailPcsInBox;
            left = orderQuantity % detailPcsInBox;

            if (left > 0 && orderQuantity > detailPcsInBox) {

                myString = String.format(" (%d x %d pcs. + 1 x %d pcs. = %d pcs.)%n", boxes, detailPcsInBox, left, orderQuantity);

currentBoxes = boxes + 1;
            } else if (left == 0) {
                myString = String.format(" (%d x %d pcs. = %d pcs.)%n", boxes, detailPcsInBox, orderQuantity);

currentBoxes = boxes;
            } else {
                myString = String.format(" (1 x %d pcs. = %d pcs.)", left, orderQuantity);
currentBoxes = boxes;
            }

     finalBoxes +=currentBoxes;
              CurrentBoxQuantity.textArea.setText(String.valueOf(finalBoxes));

            StringSelection stringSelection = new StringSelection(myString);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);


        }
        catch (java.lang.ArithmeticException | java.lang.NumberFormatException ex){
                ErrorWindow.checkInBoxQuantity();
            }

        }
    }


