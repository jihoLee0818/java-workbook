package main.java.workbook3.accesslevel;

import java.util.Scanner;

class Student {
    private String name;
    public void setName(String name) {
        // TODO: name 설정
        this.name = name;
    }
    public String getName() {
        // TODO: name 반환
        return name;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        Student s = new Student();
        s.setName(n);
        System.out.println(s.getName());
    }
}