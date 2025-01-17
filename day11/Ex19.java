package com.ict.day11;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Ex17 coffee = new Ex17("coffee", 1800);
        Ex17 ion = new Ex17("ion", 2300);
        Ex17 cola = new Ex17("cola", 2000);

        Ex17[] arr = {coffee, ion, cola};

        Scanner scan = new Scanner(System.in);
        System.out.print("금액 투입 >> ");
        int input = scan.nextInt();
        
        if (input < 1800) {
            System.out.println("잔돈 부족");
            System.out.println("잔돈 : " + input);
        } else {
            System.out.println("1.커피\t2.이온\t3.탄산");
            for (int i = 0; i < arr.length; i++) {
                if (input >= arr[i].getPrice()) {
                    System.out.print("O\t");
                } else {
                    System.out.print("X\t");
                }
            }
            System.out.println();
            System.out.print("음료 선택 >> ");
            int res = scan.nextInt();

            // 선택한 음료의 가격이 투입한 금액보다 크면 오류 메시지 출력
            if (res < 1 || res > arr.length || input < arr[res - 1].getPrice()) {
                System.out.println("잔돈이 부족하여 선택한 음료를 구매할 수 없습니다.");
                System.out.println("잔돈 : " + input);
            } else {
                int output = input - arr[res - 1].getPrice();
                System.out.println("잔돈 : " + output);
            }
        }
        scan.close();
    }
}
