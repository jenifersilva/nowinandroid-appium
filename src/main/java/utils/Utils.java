package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {
    public static String getDataFromConfigFile(String configName) throws IOException {
        String configPropertiesFile =  "src" + File.separator + "main" + File.separator + "resources" +File.separator + "config.properties";
        Properties properties = new Properties();
        properties.load(new FileInputStream(configPropertiesFile));
        return properties.getProperty(configName);
    }
}
