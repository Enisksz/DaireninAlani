package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int r,a;
        double p= 3.14;
        double result=0;
        Scanner input= new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        System.out.print("Dairenin merkez açısını giriniz: ");
        a = input.nextInt();

        result= (p*(r*r)*a)/360;
        System.out.println(result);

    }
}
