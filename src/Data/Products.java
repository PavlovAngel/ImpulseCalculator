package Data;

import Web.WebSite;
import org.apache.commons.codec.binary.Base64;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;



public class Products {
    private static final String descriptionLine = "mdc-layout-grid__cell mdc-layout-grid__cell--span-6-tablet mdc-layout-grid__cell--span-8-desktop";
    private static final String[] regex = {"</span><span style=\"padding-right:20px\">","</span>|\\("} ;
    private static final String quantityLine = "mdc-layout-grid__cell mdc-layout-grid__cell--span-1-tablet mdc-layout-grid__cell--span-2-desktop mdc-layout-grid--align-right";
    private static String id;
    private static String name;
    private static String [] description;
    private static String orderQuantity;
    private static String weight;
    private static String inBoxQuantity ; //todo from Site
    private static String URl = "http://192.168.0.57:3000/assets/products/edit/n5UPNnVBDi"; //todo from Database
    private static Document productsDocument;

    public static void loginToProductsInfo(){
        try {
            String base64login = new String(Base64.encodeBase64("shipping:shipping".getBytes()));
            Connection.Response response = Jsoup
                    .connect(URl)
                    .timeout(2000)
                    .method(Connection.Method.GET)
                    .userAgent(
                            "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:41.0) Gecko/20100101 Firefox/41.0")
                    .header("Authorization", "Basic " + base64login)
                    .execute();
              productsDocument =(response.parse());

        } catch (HttpStatusException | IllegalArgumentException ex) {

            WebSite.setIsRealUrl(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String line = String.valueOf(productsDocument.getElementById("product_box_count"));
        String [] array = line.split("value=\"");
        String [] array2 = array[1].split("\"");

        System.out.println(array2[0]); //todo make it in method inBoxQuantity

    }


    public static void setDescription() {
    String parseLine = (WebSite.getDocument().getElementsByClass(descriptionLine).html());
        String[] formatLine = parseLine.split(regex[0]);
       description = formatLine[formatLine.length-1].split(regex[1]);

    }
    public static void setQuantity(){
        String formatLine = WebSite.getDocument().getElementsByClass(quantityLine).html();
        String [] quantityArray = formatLine.split("\\n");
        orderQuantity = quantityArray[quantityArray.length-1];
        }

    public static String getOrderQuantity(){
        return orderQuantity;
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
    public static String getWeight(){
        return weight;

    }
    public static void setWeight(){
        weight = null; //todo get from site
    }
public static void  setInBoxQuantity(){
        inBoxQuantity = null;//todo get from document
}
public static String getInBoxQuantity(){
        return inBoxQuantity;
}

}

    

