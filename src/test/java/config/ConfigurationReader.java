package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static final String FILE_PATH = "config.properties";
    private static Properties properties;

    public static String getProperty(String key) {
        if (properties == null) {
            properties = new Properties();
            try (FileInputStream stream = new FileInputStream(FILE_PATH)) {
                properties.load(stream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties.getProperty(key);
    }
}

