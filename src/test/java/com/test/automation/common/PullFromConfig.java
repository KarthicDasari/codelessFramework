package com.test.automation.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PullFromConfig {
	private Properties prop = new Properties();
	InputStream inputStream;
 
	public PullFromConfig() {

        try(InputStream inputStream = new FileInputStream(SystemPropertyUtil.getRootPath() + "\\resources\\config.properties")) {
            //String canon = new File(".").getCanonicalPath();
           
            //inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
                   

            prop.load(inputStream);
            System.out.println(prop.getProperty("BaseURL"));
            System.out.println(prop.getProperty("Browser"));

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } //finally {
//            try {
//            inputStream.close();
//            } catch (IOException e) {
//                System.out.println("inputStream failed to close");
//            }
//        }
    }
	
	public Properties getConfigProp() {
		return this.prop;
	}

}