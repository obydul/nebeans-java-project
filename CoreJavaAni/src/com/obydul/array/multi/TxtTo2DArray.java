package com.obydul.array.multi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TxtTo2DArray {
//https://stackoverflow.com/questions/16379730/take-data-from-a-txt-file-into-a-2d-array
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "C:/Users/bts-2/Documents/NetBeansProjects/CoreJavaAni/nbproject/folder/file.txt";
        try {
            FileReader readConnToFile = new FileReader(fileName);
            BufferedReader read = new BufferedReader(readConnToFile);
            Scanner sc = new Scanner(read);
            int[][] temperatures = new int[4][7];
            int counter = 0;
            try {
                while (sc.hasNext() && counter < 5) {
                    for (int i = 0; i < 4; i++) {
                        counter = counter + 1;
                        for (int m = 0; m < 7; m++) {
                            temperatures[i][m] = sc.nextInt();
                        }
                    }
                }
                for (int i = 0; i < 4; i++) {
                    System.out.println("Temperature at week : " + (i + 1) + " is : " + temperatures[i][0] + ", " + temperatures[i][1] + ", " + temperatures[i][2] + ", " + temperatures[i][3] + ", " + temperatures[i][4] + ", " + temperatures[i][5] + ", " + temperatures[i][6]);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error converting number ");
            }
            sc.close();
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found " + fileName);
        } catch (IOException e) {
            System.out.println("IO-error open/close of file " + fileName);
        }
    }
}
