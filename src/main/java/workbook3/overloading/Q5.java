package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q5 {
    // TODO: format 오버로딩 (int), (String), (String,int)
    public static String format(int i) {
        return "정수: " + i;
    }
    public static String format(String s){
        return "문자열: " + s;
    }
    public static String format(String S, int i){
        return S + "(" + i + ")";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        // TODO: format 메서드 작성 후 아래 주석 해제
        System.out.println(format(name));
        System.out.println(format(age));
        System.out.println(format(name, age));
        sc.close();
    }
}