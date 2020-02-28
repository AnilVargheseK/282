package com.util.notistest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

    private Properties properties = new Properties();
    

    private static PropertiesLoader loader = new PropertiesLoader();

    private PropertiesLoader() {

    }

    public static PropertiesLoader getinstance() {
        if (loader == null) {
            loader = new PropertiesLoader();
        }
        return loader;
    }

    public void initialise(String path) throws IOException {

        // ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream propertiesInputStream = null;
        InputStream responsePropertiesInputStream = null;
        try {
            System.out.println("Path :" + path);
            propertiesInputStream = new FileInputStream(path + "notis_properties.properties");
            responsePropertiesInputStream = new FileInputStream(path + "response_properties.properties");
            System.out.println(propertiesInputStream + "   <--------");
            properties.load(propertiesInputStream);
            properties.load(responsePropertiesInputStream);

            properties.forEach((key, value) -> System.out.println("Key : " + key + ", Value : " + value));
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (propertiesInputStream != null) {
                propertiesInputStream.close();
            }
        }
    }

    public String getProperty(String key) throws IOException {
        // PropertiesLoader.initialise();
        //properties.forEach((key1, value) -> System.out.println("Key : " + key1 + ", Value : " + value));
        return properties.getProperty(key);

    }

}
