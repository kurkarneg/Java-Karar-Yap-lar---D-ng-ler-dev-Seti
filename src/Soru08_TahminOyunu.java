package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Bana bir sayi gir: ");
        Scanner g = new Scanner(System.in);
        int d = g.nextInt();
        int k = 1234;
        while(d != k){
            if(d < k){
                System.out.println("Girdiginiz sayi gizli sayidan kucuk");
                System.out.print("Lutfen yeni bir sayi giriniz: ");
                d = g.nextInt();
            }else {
                System.out.println("Girdiginiz sayi gizli sayidan buyuk");
                System.out.print("Lutfen yeni bir sayi giriniz: ");
                d = g.nextInt();
            }
        }
        System.out.println("Tebrikler dogru bildiniz Gizli SAyi: " + k);
    }
}
