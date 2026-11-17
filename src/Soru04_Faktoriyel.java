package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Bana biir ssayi gir: ");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int i = 1;
        int kutu = 1;
        while (i <= sayi)   {
            kutu = kutu*i;
            i++;
        } System.out.println(kutu);
    }
}
