package Data;

import Web.WebSite;

public class Details {
    private static final String descriptionLine = "mdc-layout-grid__cell mdc-layout-grid__cell--span-6-tablet mdc-layout-grid__cell--span-8-desktop";
    private static final String[] regex = {"</span><span style=\"padding-right:20px\">","</span>|\\("} ;
    private static final String quantityLine = "mdc-layout-grid__cell mdc-layout-grid__cell--span-1-tablet mdc-layout-grid__cell--span-2-desktop mdc-layout-grid--align-right";
    private static String id;
    private static String name;
    private static String [] description;
    private static String quantity;
    private static final int pcsInBox = 200;




public static int getPcsInBox(){
    return pcsInBox;
}

    public static void setDescription() {
    String parseLine = (WebSite.getDocument().getElementsByClass(descriptionLine).html());
        String[] formatLine = parseLine.split(regex[0]);
       description = formatLine[formatLine.length-1].split(regex[1]);
        System.out.println(formatLine[1]);

    }
    public static void setQuantity(){
        String formatLine = WebSite.getDocument().getElementsByClass(quantityLine).html();
        String [] quantityArray = formatLine.split("\\n");
        quantity = quantityArray[quantityArray.length-1];
        }

    public static String getQuantity(){
        return quantity ;
    }
    public static String [] getDescription(){
        return description;
    }

    public static void setId(){
        id = getDescription()[0].substring(0,5);
    }
    public static String getId(){

        return id;
    }

    public static void setName(){
        name = getDescription()[0].substring(6);
    }
    public static String getName(){

        return name;
    }


}

    

