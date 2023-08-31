package Web;


import StartingWindow.TextFieldURL;
import org.apache.commons.codec.binary.Base64;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;

import java.io.IOException;

public class User {

    private static final String LOGIN = "shipping:shipping";


    User() {

    }

    public static void loginToSite() throws IOException {
        try {
            String base64login = new String(Base64.encodeBase64(LOGIN.getBytes()));
            Connection.Response response = Jsoup
                    .connect(WebSite.getUrl())
                    .timeout(2000)
                    .method(Connection.Method.GET)
                    .userAgent(
                            "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:41.0) Gecko/20100101 Firefox/41.0")
                    .header("Authorization", "Basic " + base64login)
                    .execute();
           WebSite.setDocument(response.parse());
            System.out.println(WebSite.getDocument().text());
            WebSite.setIsRealUrl(true);


        } catch (Exception e) {
           WebSite.setIsRealUrl(false);
            e.printStackTrace();


        }
        if (WebSite.getIsRealUrl() == false){
            System.out.println("GRESHKA");
        }
        else {
            System.out.println("VQRNO");
        }
    }
}
