package com.nazar.praktikumpbo.pertemuan2.kelompok1;

public class DemoLoop {
    public static void main(String[] args) {
        System.out.println("For Loop");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world ke-" + i);
        }
        System.out.println();

        System.out.println("While Loop");
        int j = 0;
        while (j < 5) {
            System.out.println("Hello world ke-" + j);
            j++;
        }
        System.out.println();

        System.out.println("Do-While Loop");
        int k = 0;
        do {
            System.out.println("Hello world ke-" + k);
            k++;
        } while (k < 5);

        System.out.println();
    }
}
