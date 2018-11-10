package com.obydul.network;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromNetworkFileUsingScanner {

    public static void main(String[] args) throws IOException {
        File file = new File("\\\\192.168.1.105\\share\\test.txt");
        if (!file.exists()) {
            file.createNewFile();
        } else {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        }
        String filepath = System.getProperty("user.dir");
        System.out.println(filepath);
        
        
    }
}
