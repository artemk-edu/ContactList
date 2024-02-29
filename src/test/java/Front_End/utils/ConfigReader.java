package Front_End.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //1. Create an object of the Properties class
    //2. Load the file into FileInputStream
    //3. Load the properties file

    private static final Properties properties = new Properties();
    static{
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
        } catch (IOException e) {
            System.out.println("Property is not found in configuration.properties");
            throw new RuntimeException(e);
        }
    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
