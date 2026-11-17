package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Bana bir sayi gir: ");
        Scanner girdi = new Scanner(System.in);
        int sayi = girdi.nextInt();
        int i = 2;
        boolean flag = true;
        if(sayi == 2){
            System.out.println("Sayi asaldir");
        }else {
            while (i < sayi) {
                if (sayi % i == 0){
                    flag = false;
                    i++;
                } else {

                    i++;
                }
            } if (flag == false) {
                System.out.println("Sayi asal degildir");
            } else {
                System.out.println("Sayi asaldir");
            }
        }
    }
}
