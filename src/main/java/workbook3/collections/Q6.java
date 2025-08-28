package main.java.workbook3.collections;

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }

        int m = sc.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }

        // TODO: 합집합과 교집합 구해 출력
        Set<Integer> unionSet = new HashSet<>(list1);
        unionSet.addAll(list2);

        for (Integer integer : unionSet) {
            System.out.print(integer + " ");
        }
        System.out.println();

        Set<Integer> intersectionSet = new HashSet<>(list1);
        intersectionSet.retainAll(list2);

        for (Integer num : intersectionSet) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}