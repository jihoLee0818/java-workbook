package main.java.workbook3.collections;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++) list.add(i);
        // TODO: list를 역순으로 출력
        for (int j=n-1;j>=0;j--) {
            System.out.print((list.get(j)) + " ");
        }
    }
}