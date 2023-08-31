package Web;

import StartingWindow.TextFieldURL;
import org.jsoup.nodes.Document;

public class WebSite {
    private static final String URL = getUrl();
    private static Document document;
    private static boolean URLstatus = true;

    public WebSite() {

    }

    public static String getUrl() {

        return TextFieldURL.getUrlTextField();
    }


    public static Document getDocument() {

        return document;
    }

    public static void setDocument(Document html) {
       document = html;
    }

    public static void setIsRealUrl(boolean isRealUrl) {
        URLstatus= isRealUrl;
    }
    public static boolean getIsRealUrl() {
       return URLstatus;
    }
}
