package main.java.workbook3.collections;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) {
            set.add(sc.nextInt());
        }
        // TODO: 집합에 저장된 값을 오름차순으로 출력하는 프로그램을 작성하시오. (HashSet과 ArrayList를 조합하여 정렬)
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for(Integer num:list){
            System.out.print(num + " ");
        }
    }
}
