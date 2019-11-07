package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args)

    {
        double wei, high,BMI;
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入體重(公斤):");
        wei=scanner.nextFloat();
        System.out.println("請輸入身高(公尺):");
        high=scanner.nextFloat();
        BMI=wei / Math.pow(high,2);
        System.out.println(String.format("你的BMI是%.2f", BMI));
        // System.out.println("你的BMI是"+String.format("%.2f", BMI));

    }
}
