package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class DataBase {
    public static String id;
    public static String url;
    static final String path = "C:\\Users\\PC 2\\Desktop\\DataBase.txt";
   public  static Map<String, String> hashMapFromTextFile() {
        Map<String, String> map
                = new TreeMap<>();
        BufferedReader bufferedReader = null;

        try {

            File file = new File(path);
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                String[] parts = line.split(" ");

                id = parts[0];
                url = parts[1];
                map.put(id, url);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception ignored) {
                }
            }
        }

        return map;
    }
}
