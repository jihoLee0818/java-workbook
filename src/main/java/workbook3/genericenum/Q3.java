package main.java.workbook3.genericenum;

import java.util.Scanner;

public class Q3 {
    static <T extends Number> double sumNumbers(T[] arr) {
        // TODO: arr 요소의 합을 반환
        double sum = 0;
        for (T t : arr) {
            sum += t.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number[] nums = new Number[n];
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextDouble();
        }
        System.out.println(sumNumbers(nums));
    }
}
