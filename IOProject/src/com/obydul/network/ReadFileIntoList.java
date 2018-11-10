package com.obydul.network;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFileIntoList {

    public static List<String> readFileInList(String filename) {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void main(String[] args) {
        List l = readFileInList("\\\\192.168.1.105\\share\\test.txt");
        Iterator<String> itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
