package main.java.workbook3.collections;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 입력받은 문자열을 N개를 ArrayList에 저장한 후 모든 원소를 순서대로 출력하는 프로그램을 작성하시오.
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}