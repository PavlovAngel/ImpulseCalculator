package Data;

import Web.WebSite;

public class Details {
    private String id;
    private String name;
    private String pO;
    public static final String[] QUANTITYARRAY = (WebSite.getDocument().getElementsByClass(
            "mdc-layout-grid__cell mdc-layout-grid__cell--span-1-tablet mdc-layout-grid_" +
                    "_cell--span-2-desktop mdc-layout-grid--align-right").html().split("\\n"));


}

    

