package com.edu.uptc.apiRestDistribuidos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiRestDistribuidosApplication {

    public static void main(String[] args) throws IOException {
        InputStream fr = new FileInputStream("src/main/resources/application.properties");
        if(args.length>0){
            Properties p = new Properties();
            p.load(fr);
            String ipPort = args[0];
            p.setProperty("spring.datasource.url", "dbc:mysql://"+ipPort+"/DISTRIBUIDOS");
            fr.close();

            FileOutputStream fos = new FileOutputStream("src/main/resources/application.properties");
            p.store(fos, "");
        }
        SpringApplication.run(ApiRestDistribuidosApplication.class, args);
    }

}
