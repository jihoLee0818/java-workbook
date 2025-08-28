package main.java.workbook3.polymorphism;

import java.util.Scanner;

interface Renderer {
    void render();
}

class SquareRenderer implements Renderer {
    public void render() {
        System.out.println("Render square");
    }
}

class CircleRenderer implements Renderer {
    public void render() {
        System.out.println("Render circle");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 배열의 크기가 3인 Renderer 인터페이스 타입 배열을 선언, 변수명은 arr
        Renderer[] arr = new Renderer[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            // TODO: t 입력값이 "square"인 경우 SquareRenderer 타입 객체 아니면 CircleRenderer 타입 객체를 arr 배열에 추가합니다.
            if (t.equalsIgnoreCase("square")) {
                arr[i] = new SquareRenderer();
            } else if (t.equalsIgnoreCase("circle")) {
                arr[i] = new CircleRenderer();
            }
            //아래와 같이 if else 문을 삼항연산자로 표현할 수 있음
            //arr[i] = t.equalsIgnoreCase("square") ? new SquareRenderer() : new CircleRenderer();
        }
        // TODO: arr 배열에 추가된 객체들의 render() 메서드를 호출합니다.
        for (int i = 0; i < 3; i++) {
            arr[i].render();
        }
        //아래와 같이 향상된 for문 사용 가능
        /*
        for (Renderer r : arr) {
            r.render();
        }
        */
    }
}