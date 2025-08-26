package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q6 {
    // TODO: multiply 오버로딩 (int[]), (int[][], int[][])
    public static int multiply(int[] arr) {
        int product = 1;
        for (int j : arr) {
            product *= j;
        }
        return product;
    }

    public static int[][] multiply(int[][] m1, int[][] m2) {
        int size = m1.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if (type == 2) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(multiply(arr)); // TODO: multiply(int[]) 메서드 작성 후 주석 해제
        } else {
            int[][] m1 = new int[2][2];
            int[][] m2 = new int[2][2];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m1[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m2[i][j] = sc.nextInt();
                }
            }
            int[][] result = multiply(m1, m2);
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(result[i][j] + (j == 1 ? "" : " "));
                }
                System.out.println();
            }
        }
    }
}