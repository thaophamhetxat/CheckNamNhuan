package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap nam can kiem tra:");
        c = scanner.nextInt();

        if (c % 4 == 0) {
            if (c % 100 == 0) {
                if (c % 400 == 0) {
                    System.out.println("day la nam nhuan");
                } else {
                    System.out.println("day khong la nam nhuan");
                }

            } else {
                System.out.println("day la nam nhuan");
            }

        } else {
            System.out.println("day khong phai nam nhuan");
        }

    }
}
// kiểm tra 1900 không phải năm nhuận
// 2000 la nam nhuan
//12: năm nhuận
//13: năm không nhuận