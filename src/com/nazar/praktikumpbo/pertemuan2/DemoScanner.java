package com.nazar.praktikumpbo.pertemuan2;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        // Alt + Enter
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukan usia: ");
        int usia = input.nextInt();

        System.out.print("Masukan tinggi badan: ");
        float tinggi = input.nextFloat();

        System.out.println("=> Profile Saya <=");
        System.out.println();
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Tinggi: " + tinggi + " cm");
    }
}
