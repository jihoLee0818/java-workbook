package main.java.workbook3.overloading;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q1 {
    // TODO: printValue 오버로딩 (int), (double), (String)
    public static void printValue(int value) {
        System.out.println(value);
    }

    public static void printValue(double value) {
        System.out.println(value);
    }

    public static void printValue(String value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        String s = sc.next();
        // TODO: printValue (int), (double), (String) 메서드 작성 후 아래 주석 해제
        printValue(i);
        printValue(d);
        printValue(s);
        sc.close();
    }
}
