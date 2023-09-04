package Data;

import Web.WebSite;

public class Details {
    public static String IDLINE ;
    public static String [] idArray;
    private String name;
    private String id;

    public static  String quantityLine ;
    public static String [] quantityArray ;

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


    }  public static void setQuantityLine() {
        quantityLine = WebSite.getDocument().getElementsByClass(
                "mdc-layout-grid__cell mdc-layout-grid__cell--span-1-tablet mdc-layout-grid_" +
                        "_cell--span-2-desktop mdc-layout-grid--align-right").html();
    }
    public static void setQuantityArray(){
       quantityArray = quantityLine.split("\\n");
    }

}

    

