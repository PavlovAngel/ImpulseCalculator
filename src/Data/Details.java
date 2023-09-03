package Data;

import Web.WebSite;

public class Details {
    public static String IDLINE ;
    public static String [] idArray;
    private String name;
    private String id;

    public static final String QUANTITYLINE =WebSite.getDocument().getElementsByClass(
            "mdc-layout-grid__cell mdc-layout-grid__cell--span-1-tablet mdc-layout-grid_" +
                    "_cell--span-2-desktop mdc-layout-grid--align-right").html();
    private static String [] quantityArray = QUANTITYLINE.split("\\n");

    public static void setID(){
   idArray = IDLINE.split("\\n");
}
public static String[] getID(){
    return idArray;
    }
    public static void setidLine(){
        IDLINE = WebSite.getDocument().getElementsByClass(
                "mdc-layout-grid__cell mdc-layout-grid__cell-" +
                        "-span-6-tablet mdc-layout-grid__cell--span-8-desktop").html() ;

    }
}

    

