package com.example.utils;

import com.example.geometry.Circle;  // OR we can write
import com.example.geometry.Rectangle;  // import com.example.geometry.*;

public class Calculator {
    public static void main(String[] args) {
        Circle circ=new Circle(5.8);
        Rectangle rect= new Rectangle(5,10);

        double circArea= Math.PI*(Math.pow(circ.radius,2));
        double rectArea= rect.length*rect.breadth;

        System.out.printf("Area of Rectangle is %.2f and Circle is %.2f ",rectArea,circArea);
    }
}
