package com.nazar.praktikumpbo.pertemuan2;

public class DemoLoop {
    public static void main(String[] args) {
        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Looping ke-" + i + "/5");
        }
        System.out.println();

        // While Loop
        int counter = 0;
        while(counter < 5) {
            System.out.println("Looping ke-" + counter + "/5");
            counter++;
        }
        System.out.println();

        // Do-While Loop
        counter = 0;
        do {
            System.out.println("Looping ke-" + counter + "/5");
            counter++;
        } while (counter < 5);
    }
}
