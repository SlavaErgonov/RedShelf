package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {

    private static Properties properties = new Properties();

    static  {
        try {
            String path = "configuration.properties";
            FileInputStream file = new FileInputStream(path);
            properties.load(file);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
    }

    public static String get(String keyName) {
        return properties.getProperty(keyName);

    }
}
