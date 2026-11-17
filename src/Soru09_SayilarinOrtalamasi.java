package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.println("Bana altaltta 10 sayi gir");
        float sayi1 = g.nextFloat();
        float sayi2 = g.nextFloat();
        float sayi3 = g.nextFloat();
        float sayi4 = g.nextFloat();
        float sayi5 = g.nextFloat();
        float sayi6 = g.nextFloat();
        float sayi7 = g.nextFloat();
        float sayi8 = g.nextFloat();
        float sayi9 = g.nextFloat();
        float sayi10 = g.nextFloat();
        float toplam = sayi1 + sayi2 + sayi3 + sayi4 + sayi5 + sayi6 + sayi7 + sayi8 + sayi9 + sayi10;
        float aritmetik = (sayi1 + sayi2 + sayi3 + sayi4 + sayi5 + sayi6 + sayi7 + sayi8 + sayi9 + sayi10) / 10;
        float pozitif = 0;
        float negatif = 0;
        float sifir = 0;
        if (sayi1 < 0) {
            negatif = negatif + 1;
        } else if (sayi1 > 0) {
            pozitif = pozitif + 1;
        } else {
            sifir = sifir + 1;
        }
        if (sayi2 < 0) {
            negatif = negatif + 1;
        } else if (sayi2 > 0) {
            pozitif = pozitif + 1;
        } else {
            sifir = sifir + 1;
        }
        if (sayi3 < 0) {
            negatif = negatif + 1;
        } else if (sayi3 > 0) {
            pozitif = pozitif + 1;
        } else {
            sifir = sifir + 1;
        }
        if (sayi4 < 0) {
            negatif = negatif + 1;
        } else if (sayi4 > 0) {
            pozitif = pozitif + 1;
        } else {
            sifir = sifir + 1;
        }
        if (sayi5 < 0) {
            negatif = negatif + 1;
        } else if (sayi5 > 0) {
            pozitif = pozitif + 1;
        } else {
            sifir = sifir + 1;
        }
        if (sayi6 < 0) {
            negatif = negatif + 1;
        } else if (sayi6 > 0) {
            pozitif = pozitif + 1;
        } else {
            sifir = sifir + 1;
        }
        if (sayi7 < 0) {
            negatif = negatif + 1;
        } else if (sayi7 > 0) {
            pozitif = pozitif + 1;
        } else {
            sifir = sifir + 1;
        }
        if (sayi8 < 0) {
            negatif = negatif + 1;
        } else if (sayi8 > 0) {
            pozitif = pozitif + 1;
        } else {
            sifir = sifir + 1;
        }
        if (sayi9 < 0) {
            negatif = negatif + 1;
        } else if (sayi9 > 0) {
            pozitif = pozitif + 1;
        } else {
            sifir = sifir + 1;
        }
        if (sayi10 < 0) {
            negatif = negatif + 1;
        } else if (sayi10 > 0) {
            pozitif = pozitif + 1;
        } else {
            sifir = sifir + 1;
        }
        System.out.println("toplam" + toplam);
        System.out.println("aritmetik" + aritmetik);
        System.out.println("negatif" + negatif);
        System.out.println("pozitif" + pozitif);
        System.out.println("sifir" + sifir);
    }
}
