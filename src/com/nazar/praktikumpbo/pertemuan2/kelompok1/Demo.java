package com.nazar.praktikumpbo.pertemuan2.kelompok1;

public class Demo {
    // main atau psvm
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Good Morning");

        // deklarasi variabel
        // type namaVariabel;
        int a;
        float b;
        double c;
        boolean d;
        char e;
        String f;

        // assignment (memasukkan nilai ke variabel)
        a = 7;
        b = 0.5f;
        c = 0.7;
        d = true;
        e = 'g';
        f = "Muhammad";

        // operasi aritmatika
        int x, y, hasilPenjumlahan, hasilPengurangan, hasilPerkalian;
        float hasilPembagian;

        x = 5;
        y = 10;
        hasilPenjumlahan = x + y;
        hasilPengurangan = x - y;
        hasilPerkalian = x * y;
        hasilPembagian = (float) x / (float) y;

        System.out.println(hasilPenjumlahan);
        System.out.println(hasilPengurangan);
        System.out.println(hasilPerkalian);
        System.out.println(hasilPembagian);
    }
}
