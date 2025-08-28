package main.java.workbook3.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(sc.next(), sc.nextInt());
        }
        // TODO: map의 키와 값 목록 출력
        for(String key:map.keySet()){
            System.out.print(key+" ");
        }
        System.out.println();
        for(Integer value : map.values()){
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
