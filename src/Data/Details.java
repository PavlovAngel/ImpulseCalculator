package Data;

import Frame.MainWindow.TextAreas.DescriptionTextArea;
import Web.WebSite;

import java.util.Arrays;
import java.util.Locale;

public class Details {
    public static String IDLINE;
    public static String[] idArray;
    public static String description;
    private String id;

    public static String quantityLine;
    public static String[] quantityArray;

    public static void setID() {
        idArray = IDLINE.split("\\n");
    }

    public static String[] getID() {
        return idArray;
    }

    public static void setidLine() {
        IDLINE = WebSite.getDocument().getElementsByClass(
                "mdc-layout-grid__cell mdc-layout-grid__cell-" +
                        "-span-6-tablet mdc-layout-grid__cell--span-8-desktop").html();


    }

    public static void setQuantityLine() {
        quantityLine = WebSite.getDocument().getElementsByClass(
                "mdc-layout-grid__cell mdc-layout-grid__cell--span-1-tablet mdc-layout-grid_" +
                        "_cell--span-2-desktop mdc-layout-grid--align-right").html();
    }

    public static void setQuantityArray() {
        quantityArray = quantityLine.split("\\n");
    }

    public static void setDescription() {
        String nameClass = (WebSite.getDocument().getElementsByClass("mdc-layout-grid__cell mdc-layout-grid__cell--span-6-tabl" +
                "et mdc-layout-grid__cell--span-8-desktop").html());
        String[] array = nameClass.split("</span><span style=\"padding-right:20px\">");
        String[] array2 = array[array.length-1].split("</span>");
        description = (array2[0].substring(6));
        if (array2.length < 1){
            DescriptionTextArea.textArea.setText("nqma");
        }
    }

}

    

