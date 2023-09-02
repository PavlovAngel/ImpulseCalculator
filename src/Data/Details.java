package Data;

import Web.WebSite;

public class Details {
    private String id;
    private String name;
    private String pO;
    private static String quantity ;
public static String getQuantity(){
   return quantity = WebSite.getDocument().getElementsByClass(
           "mdc-layout-grid__cell mdc-layout-grid__cell--span-1-tablet mdc-layout-grid__cell--span-2-desktop mdc-layout-grid--align-right").html();
}

    
}
