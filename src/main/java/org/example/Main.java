package org.example;

import java.util.Scanner;
// Klavyeden girilen terim (n) sayısı için "Üçgensel sayıları" veren program.
public class Main {
    public static void main(String[] args) {

        int n;
        int i;
        int u;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Sayıyı Giriniz : ");
        n = scanner.nextInt();
            for ( i = 1; i<=n; i++){

                u = i*(i+1)/2;
                System.out.println(u + "\t");
            }
    }
}

