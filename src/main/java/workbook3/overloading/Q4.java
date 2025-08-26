package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q4 {
    // TODO: area 오버로딩 (double r), (double w, double h), (double base, double height)
    public static double areaCircle(double r){
        return Math.PI * r * r;
    }
    public static double areaRect(double w, double h){
        return w * h;
    }
    public static double areaTri(double b, double h){
        return b * h / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        if (type.equals("circle")) {
            double r = sc.nextDouble();
            System.out.println(areaCircle(r)); // TODO: area 메서드 작성 후 주석 해제
        } else if (type.equals("rect")) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            System.out.println(areaRect(w,h)); // TODO: area 메서드 작성 후 주석 해제
        } else {
            double b = sc.nextDouble();
            double h = sc.nextDouble();
            System.out.println(areaTri(b,h)); // TODO: area 메서드 작성 후 주석 해제
        }
    }
}