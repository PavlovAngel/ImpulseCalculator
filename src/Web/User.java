package Web;

import org.apache.commons.codec.binary.Base64;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import Frame.StartingWindow.TextFieldURL;

import java.awt.Color;
import java.io.IOException;

public class User {

    private static final String LOGIN = "shipping:shipping5385";

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
            WebSite.setIsRealUrl(true);

        } catch (org.jsoup.HttpStatusException | java.lang.IllegalArgumentException ex) {

            WebSite.setIsRealUrl(false);
        }
    }

    public static void enterURL() {
        WebSite.setURL();

        try {
            User.loginToSite();
        } catch (IOException ex) {
            WebSite.setIsRealUrl(false);
        }

    }

    public static void tryURL() {
        if (WebSite.getIsRealUrl()) {
            TextFieldURL.changeColor(Color.BLACK);
            TextFieldURL.setDefaultText();
        }
        else{
            TextFieldURL.changeColor(Color.RED);
            TextFieldURL.setErrorText();
        }
    }

}
