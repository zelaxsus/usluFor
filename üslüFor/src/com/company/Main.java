package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a,b;
        int total=1;
        System.out.print("Üslü alınıcak sayıyı giriniz : ");
        a= inp.nextInt();
        System.out.print("Üslü'nü giriniz: ");
        b=inp.nextInt();
        for (int i=1;i <= b;i++)
        {
            total*=a;
        }

        System.out.println(total);

    }
}
