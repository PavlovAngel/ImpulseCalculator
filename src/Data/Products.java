package Data;

import Frame.ErrorWindow.ErrorWindow;
import Frame.MainWindow.Labels.QuantityLabel;
import Frame.MainWindow.MainFrame;
import Frame.MainWindow.TextAreas.*;
import Web.WebSite;
import org.apache.commons.codec.binary.Base64;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.naming.Name;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;


public class Products {
    private static final String descriptionLine = "mdc-layout-grid__cell mdc-layout-grid__cell--span-6-tablet mdc-layout-grid__cell--span-8-desktop";
    private static final String[] regex = {"</span><span style=\"padding-right:20px\">", "</span>|\\("};
    private static final String quantityLine = "mdc-layout-grid__cell mdc-layout-grid__cell--span-1-tablet mdc-layout-grid__cell--span-2-desktop mdc-layout-grid--align-right";
    private static String id;
    private static String name;
    private static String[] description;
    private static String orderQuantity;
    private static String weight;
    private static String inBoxQuantity; //todo from Site
    private static String URl; //todo from Database
    private static Document productsDocument;
    private static String parseLine;
    public static String[] formatLine;
    public static Double totalWeight = 0.0;
    public static int boxes;

    public static void loginToProductsInfo() {
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
            productsDocument = (response.parse());

        } catch (HttpStatusException | IllegalArgumentException ex) {

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void setDescription() {
        parseLine = (WebSite.getDocument().getElementsByClass(descriptionLine).html());
        formatLine = parseLine.split(regex[0]);
        description = formatLine[formatLine.length - 1].split(regex[1]);

    }

    public static void setOrderQuantity() {
        String formatLine = WebSite.getDocument().getElementsByClass(quantityLine).html();
        String[] quantityArray = formatLine.split("\\n");
        orderQuantity = quantityArray[quantityArray.length - 1];
    }

    public static String getOrderQuantity() {
        return orderQuantity;
    }

    public static String[] getDescription() {
        return description;
    }

    public static void setId() {
        id = getDescription()[0].substring(0, 5);
    }

    public static String getId() {

        return id;
    }

    public static void setName() {
        name = getDescription()[0].substring(6);
    }

    public static String getName() {

        return name;
    }

    public static String getWeight() {
        return weight;

    }

    public static void setWeight() {
        String line = String.valueOf(productsDocument.getElementById("product_gramaj"));
        String[] array = line.split("value=\"");
        String[] array2 = array[1].split("\"");
        double currentWeight = Double.parseDouble(String.valueOf(Double.parseDouble(array2[0])))* Double.parseDouble(String.valueOf(Double.parseDouble(getOrderQuantity())))*0.001;
        weight = currentWeight +" kg";
        totalWeight +=currentWeight;
        if (weight.equals("")){
            WeightTextArea.textArea.setText("");
         ErrorWindow.checkProductWeight();
        }
        else {
            //WeightTextArea.textArea.setText(getWeight());
            WeightTextArea.textArea.setText(String.format("%.2f",totalWeight ).replace(",",".") + " kg");
        }
    }

    public static void setInBoxQuantity() {
        String line = String.valueOf(productsDocument.getElementById("product_box_count"));
        String[] array = line.split("value=\"");
        String[] array2 = array[1].split("\"");
        inBoxQuantity = array2[0];

    }

    public static String getInBoxQuantity() {

        return inBoxQuantity;
    }
    public static void setBoxes(){

    }

    public static void settUrl() {
        NameTextArea.textArea.setForeground(Color.BLACK);
        inBoxQuantity = "";
        Map<String, String> details = DataBase.hashMapFromTextFile();

        if (details.containsKey(Products.getId())) {
            URl = "http://192.168.0.57:3000/assets/products/edit/" + (details.get(Products.getId()));
            Products.loginToProductsInfo();
            Products.setInBoxQuantity();
            if (Products.getInBoxQuantity().equals("")) {
                NameTextArea.textArea.setText(Products.getName());
                IdTextArea.textArea.setText(Products.getId());
            }
        } else {
            ErrorWindow.checkDataBase();
            NameTextArea.textArea.setText(Products.getName());
            IdTextArea.textArea.setText(Products.getId());
            if (Products.getInBoxQuantity().equals("")) {
                NameTextArea.textArea.setText(Products.getName());
                IdTextArea.textArea.setText(Products.getId());
            }


        }


    }
}

    

