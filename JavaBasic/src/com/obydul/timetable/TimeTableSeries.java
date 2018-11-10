package com.obydul.timetable;

import java.util.Scanner;

public class TimeTableSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fromnum, tonum;

        System.out.print("Enter initial num : ");
        fromnum = sc.nextInt();

        System.out.print("Enter final num : ");
        tonum = sc.nextInt();

        for (int i = fromnum; i <= tonum; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + j * i);
            }
            System.out.println("");
        }
        System.out.println("");

    }
}
