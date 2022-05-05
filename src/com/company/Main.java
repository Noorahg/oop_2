package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	Triangle triangle=new Triangle();
    System.out.println("Введите сторону AB");
    triangle.a=sc.nextInt();
    System.out.println("Введите сторону BC");
    triangle.b= sc.nextInt();
    System.out.println("Введите сторону CA");
    triangle.c= sc.nextInt();
    triangle.area();
    }
}
