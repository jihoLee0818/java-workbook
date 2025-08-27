package main.java.workbook3.thissuper;

import java.util.Scanner;

class Vehicle {
    String model;
    int year;
    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String toString() {
        return "Model: " + model + ", Year: " + year;
    }
}

class Car /* TODO: Vehicle 클래스 상속 */ extends Vehicle {
    String fuel;
    Car(String model, int year, String fuel) {
        // TODO: super() 호출 및 fuel 초기화
        super(model, year);
        this.fuel = fuel;
    }
    public String toString() {
        // TODO: super 키워드 활용해서 Model, Year 정보와 함께 Fuel: " + fuel 출력
        return super.toString() + " Fuel: " + fuel;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = sc.next();
        int year = sc.nextInt();
        String fuel = sc.next();
        Car car = new Car(model, year, fuel);
        System.out.println(car.toString());
    }
}
