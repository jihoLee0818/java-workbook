package main.java.workbook3.varinit;

import java.util.Scanner;

class BankAccount {
    static {
        // TODO: 은행 이름 출력
        System.out.println("Bank Opened");
    }
    {
        // TODO: 계좌 개설 메시지 출력
        System.out.println("Account Created");
    }
    int balance;
    BankAccount(int balance) {
        this.balance = balance;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        BankAccount a1 = new BankAccount(b1);
        BankAccount a2 = new BankAccount(b2);
        System.out.println(a1.balance);
        System.out.println(a2.balance);
    }
}