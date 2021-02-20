package main.java.javaguru;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Circle userCircle = new Circle();
        Scanner scRadius = new Scanner(System.in);
        System.out.println("Ввведите радиус");

        double userRadius = scRadius.nextDouble();

        userCircle.setRadius(userRadius);
        double area = userCircle.calculateArea();
        System.out.println("Площадь круга радиусом: " + userRadius + " ровняется " + area);
    }
}
class Circle{
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea(){
        double area = Math.round(Math.PI * Math.pow(radius, 2));
        return area;
    }
}
