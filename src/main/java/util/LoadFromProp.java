package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadFromProp {

    public static String getProperty(String property){

        Properties properties = new Properties();
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("data.properties");
            //InputStream inputStream1 = classLoader.getResourceAsStream("log4j.properties");
            properties.load(inputStream);
            //properties.load((inputStream1));
        }catch (IOException e){
            e.printStackTrace();
        }
        return properties.getProperty(property);

   }
}
