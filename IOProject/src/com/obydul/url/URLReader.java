package com.obydul.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {

    public static void main(String[] args) throws IOException {
        URL oralce = new URL("https://www.oracle.com");
        BufferedReader in = new BufferedReader(new InputStreamReader(oralce.openStream()));

        String inputline;
        while ((inputline = in.readLine()) != null) {
            System.out.println(inputline);
        }
        in.close();

        String path = System.getProperty("user.dir");
        System.out.println(path);
    }

}
