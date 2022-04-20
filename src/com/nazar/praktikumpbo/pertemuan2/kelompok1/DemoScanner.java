package com.nazar.praktikumpbo.pertemuan2.kelompok1;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Scanner inputString = new Scanner(System.in);
//        Scanner inputCharacter = new Scanner(System.in);

        System.out.print("Masukan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukan usia: ");
        int usia = input.nextInt();

        System.out.print("Masukan nama ibu: ");
        String namaIbu = input.nextLine();

        System.out.print("Masukan tinggi badan: ");
        float tinggiBadan = input.nextFloat();

        System.out.print("Masukan inisial: ");
        char inisial = input.next().charAt(0);

        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Tinggi Badan : " + tinggiBadan + " cm");
        System.out.println("Inisial : " + inisial);
    }
}
