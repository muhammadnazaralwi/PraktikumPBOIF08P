package com.nazar.praktikumpbo.pertemuan2;

public class Demo {
    // psvm atau main
    public static void main(String[] args) {
        System.out.println("Hello world!"); // ada enter

        System.out.print("Hello"); // tidak ada enter
        System.out.print("Hello"); // tidak ada enter

        // Deklarasi Variabel
        int a;
        float b;
        double c;
        char d;
        boolean e;

        String f;

        // Assignment Variabel
        a = 5;
        b = 5.5f;
        c = 5.5;
        d = 'Y';
        e = true;

        f = "Muhammad Nazar";

        // Operasi Aritmatika
        int x, y, hasil;
        float hasilPembagian;

        x = 5;
        y = 10;
        hasil = x + y;
        hasilPembagian = (float) x / (float) y; // -> casting

        System.out.println("Hasil Penjumlahan: " + hasil);
        System.out.println("Hasil Pembagian: " + hasilPembagian);

        // Peracabangan

    }
}
