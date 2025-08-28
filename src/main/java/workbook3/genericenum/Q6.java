package main.java.workbook3.genericenum;

import java.util.Scanner;

class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public String toString() {
        return key + ":" + value;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k1 = sc.next();
        int v1 = sc.nextInt();
        String k2 = sc.next();
        String v2 = sc.next();
        // TODO: 위 입력값에 알맞은 타입의 Pair 제네릭 클래스 선언
        Pair<String, Integer> pair1 =  new Pair<>(k1, v1);
        Pair<String, String> pair2 = new Pair<>(k2, v2);
        // TODO: 선언한 제네릭 객체 2개 출력
        System.out.println(pair1);
        System.out.println(pair2);
    }
}