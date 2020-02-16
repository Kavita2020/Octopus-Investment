package com.octopusinvestments.property;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Kavita Shah on 14/02/2020
 */
public class LoadProperties {

    public static  FileInputStream fileInputStream;
    public static Properties properties;

    public String getMyProperty(String key) {

        try {
             fileInputStream = new FileInputStream("C:\\Users\\Kavita Shah\\IdeaProjects\\octopusinvestments-com-hybrid\\src\\test\\java\\resources\\property\\config.properties");
              properties = new Properties();
             properties.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return properties.getProperty(key);
    }
}
