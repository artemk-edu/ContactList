package Front_End.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataReader {
    //1. Create an object of the Properties class
    //2. Load the file into FileInputStream
    //3. Load the properties file

    private static final Properties properties = new Properties();

    public static String getData(String fileName, String keyword){

        try {
            FileInputStream file = new FileInputStream(fileName.toLowerCase().trim()+".properties");
            properties.load(file);
        }catch (IOException e) {
            System.out.println("Data is not found in data.properties");
            throw new RuntimeException(e);
        }

        return properties.getProperty(keyword);
    }
}
