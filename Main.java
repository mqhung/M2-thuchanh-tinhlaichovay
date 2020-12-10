package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount:");
        double money = input.nextDouble();
        System.out.println("Enter month:");
        int month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        double rate = input.nextDouble();
        double total = 0;
        for (int i =0; i<month; i++){
            total +=money * (rate/100)/12 * month;
        }
        System.out.println("Total money is: "+total);
    }
}
