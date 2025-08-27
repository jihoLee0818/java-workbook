package main.java.workbook3.varinit;

import java.util.Random;

class RandomInit {
    int[] arr = new int[5];

    {
        // TODO: arr 배열을 난수로 채움
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
    }

    void printArray() {
        // TODO: arr 요소 출력
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}

public class Q4 {
    public static void main(String[] args) {
        RandomInit obj = new RandomInit();
        obj.printArray();
    }
}
