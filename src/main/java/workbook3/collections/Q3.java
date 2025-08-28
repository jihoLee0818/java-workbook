package main.java.workbook3.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 문자열과 정수 쌍을 N개 입력받아 HashMap<String,Integer>에 저장한 후, 주어진 키에 대한 값을 출력하는 프로그램을 작성하시오.
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            String key = sc.next();
            int val = sc.nextInt();
            map.put(key, val);
        }
        String query = sc.next();
        System.out.println(map.get(query));
    }
}