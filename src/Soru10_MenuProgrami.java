package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("- 1: Bir sayının karesini hesapla.");
        System.out.println("- 2: Bir sayının küpünü hesapla.");
        System.out.println("- 3: Bir sayının tek veya çift olduğunu kontrol et.");
        System.out.println("- 4: Bir sayının pozitif, negatif veya sıfır olduğunu belirle.");
        System.out.println("- 5: Programdan çık.");
        int girdi = input.nextInt();
        if(girdi == 5){

        }else if (girdi < 1 || girdi > 5) {
            System.out.println("hatali giris");
        }else{
            while(girdi != 5){
                switch(girdi) {
                    case 1:
                        System.out.print("Bir sayi giriniz: ");
                        int is1 = input.nextInt();
                        int sonuc = is1*is1;
                        System.out.println("Sonucunuz" + sonuc);
                        break;
                    case 2:
                        System.out.print("Bir sayi giriniz: ");
                        int is2 = input.nextInt();
                        int sonuc2 = is2*is2*is2;
                        System.out.println("Sonucunuz" + sonuc2);
                        break;
                    case 3:
                        System.out.print("Bir sayi giriniz: ");
                        int is3 = input.nextInt();
                        if(is3%2==0){
                            System.out.println("CIfttir");
                        }else{
                            System.out.println("Tektir");
                        }
                        break;
                    case 4:
                        System.out.print("Bir sayi giriniz: ");
                        int is4 = input.nextInt();
                        if (is4 < 0){
                            System.out.println("NEgatif");
                        } else if (is4 > 0) {
                            System.out.println("Pozitif");
                        }else{
                            System.out.println("Sifirdir");
                        }
                        break;
                }
                System.out.println("- 1: Bir sayının karesini hesapla.");
                System.out.println("- 2: Bir sayının küpünü hesapla.");
                System.out.println("- 3: Bir sayının tek veya çift olduğunu kontrol et.");
                System.out.println("- 4: Bir sayının pozitif, negatif veya sıfır olduğunu belirle.");
                System.out.println("- 5: Programdan çık.");
                girdi = input.nextInt();
            }
        }
        System.out.println("program sonlandiriliyor");







    }
}
