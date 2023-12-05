package utils;

import org.openqa.selenium.By;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Reader {

    static Properties properties = new Properties();

    public static String getProperty(String param) {
        if(properties.toString().equals("{}")){
            initProperty();
        }
        return properties.getProperty(param);
    }
    private static void initProperty(){
        try(FileReader fileReader = new FileReader("C://Users//bluvg//Documents//GitHub//Spoty//src//test//resources//locators.property")) {
            properties.load(fileReader);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
