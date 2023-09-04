package Data;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.awt.datatransfer.Clipboard;

public class Calculator {
    public static void calculate() throws IOException {
        int detailPcsInBox;
        int boxes;
        int orderQuantity = Integer.parseInt(Products.getOrderQuantity());
         int left;
         String myString;
         String boxCounter;
         int currentBoxes;
         int finalBoxes;

        detailPcsInBox = Products.getInBoxQuantity();

        boxes = orderQuantity / detailPcsInBox;
        left = orderQuantity % detailPcsInBox;
        // finalBoxes += Frame.weight;
        // boxCounter = String.format("Boxes: %d", finalBoxes);

        if (left > 0 && orderQuantity > detailPcsInBox) {

            myString = String.format(" (%d x %d pcs. + 1 x %d pcs. = %d pcs.)%n", boxes, detailPcsInBox, left, orderQuantity);


        } else if (left == 0) {
            myString = String.format(" (%d x %d pcs. = %d pcs.)%n", boxes, detailPcsInBox, orderQuantity);


        } else {
            myString = String.format(" (1 x %d pcs. = %d pcs.)", left, orderQuantity);


        }

        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

    }
}
