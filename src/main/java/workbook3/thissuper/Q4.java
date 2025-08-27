package main.java.workbook3.thissuper;

import java.util.Scanner;

class Employee {
    String name, dept;
    int salary;

    Employee(String name, String dept, int salary) {
        // TODO: 필드 초기화
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    void printInfo() {
        System.out.print("Name: " + name + ", Dept: " + dept + ", Salary: " + salary + ", ");
    }
}

class Manager /* TODO: Employee 상속 */extends Employee {
    String team;

    Manager(String name, String dept, int salary, String team) {
        // TODO: super() 호출 및 team 초기화
        super(name, dept, salary);
        this.team = team;
    }

    void printInfo() {
        // TODO: super.printInfo() 호출 후 팀 정보 출력
        super.printInfo();
        System.out.println("Team: " + team);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String d = sc.next();
        int s = sc.nextInt();
        String t = sc.next();
        Manager m = new Manager(n, d, s, t);
        m.printInfo();
    }
}
