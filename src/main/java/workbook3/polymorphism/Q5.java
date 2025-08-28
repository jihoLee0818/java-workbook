package main.java.workbook3.polymorphism;

import java.util.Scanner;

abstract class Polygon {
    abstract double area();
    abstract double perimeter();
}

class Triangle extends Polygon {
    double a, b, c;

    Triangle(double a, double b, double c) {
        //헤론의 공식을 위해 사전 예외처리
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("삼각형이 아닙니다.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double area() {
        return Math.sqrt(perimeter() / 2 * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c));
    }

    double perimeter() {
        return a + b + c;
    }
}

class Rectangle extends Polygon {
    double w, h;

    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    double area() {
        return w * h;
    }

    double perimeter() {
        return 2 * (w + h);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            String t = sc.next();
            // TODO: 입력받은 t의 값에 따라 Polygon 타입의 참조변수 p 에 알맞은 구현체를 넣어(참조해)줍니다.
            Polygon p = null;
            // TODO: triangle은 세변 a, b, c를 입력받습니다.
            // TODO: rect은 넓이(w)와 높이(h) 값을 입력받습니다.
            if (t.equals("triangle")) {
                p = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            } else if (t.equals("rect")) {
                p = new Rectangle(sc.nextDouble(), sc.nextDouble());
            } else {
                System.out.println("error");
                continue;
            }
            // TODO: System.out.println(p.area() + " " + p.perimeter()); 를 선언하여 면적과 둘레를 출력한다.
            System.out.println(p.area() + " " + p.perimeter());
        }
    }
}