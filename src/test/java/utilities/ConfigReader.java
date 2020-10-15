package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    //This class will read the data from the  configuration.properties file!!!
    //Create a properties instance. Data type=Properties, Instance name+ properties
    private static Properties properties;

    static{
        //path of teh configuration.properties file
        String path = "configuration.properties";
        try{
            //Opening the configuration.properties file
            FileInputStream fileInputStream = new FileInputStream(path);
            //loading and reading the file
            properties = new Properties();
            properties.load(fileInputStream);
            //closing the file
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //create a method to READ
    //This method will get the KEY and returns  the VALUE
public static String getProperty(String key){
        return properties.getProperty(key);

}

    //TESTING IF OUR LOGIC WORKS
    public static void main(String[] args) {
//        System.out.println(properties.getProperty("kaola_url"));
    }


}

