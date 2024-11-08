package Web;

import org.jsoup.nodes.Document;
import Frame.StartingWindow.TextFieldURL;

public class WebSite {
    private static String URL;
    private static Document document;
    private static boolean URLStatus = true;
    public static String getUrl() {

        return URL;
    }

    public static void setURL() {
        URL = TextFieldURL.getUrlTextField().replace("edit", "view");
    }

    public static Document getDocument() {

        return document;
    }

    public static void setDocument(Document html) {
        document = html;
    }

    public static void setIsRealUrl(boolean isRealUrl) {
        URLStatus = isRealUrl;
    }

    public static boolean getIsRealUrl() {
        return URLStatus;

    }

}
