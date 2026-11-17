package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Bana bir sayi gir: ");
        Scanner input = new Scanner(System.in);
        int sayi1 = input.nextInt();
        int i = 1;
        int kutu_tek=0;
        int kutu_cift=0;
        while (i <= sayi1){
            if(i%2==0){
                kutu_cift = kutu_cift + i;
                i++;
            }else{
                kutu_tek = kutu_tek + i;
                i++;
            }

        }
        System.out.println(kutu_cift);
        System.out.println(kutu_tek);

    }
}
