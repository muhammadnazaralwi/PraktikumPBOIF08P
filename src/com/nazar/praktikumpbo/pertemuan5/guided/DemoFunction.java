package com.nazar.praktikumpbo.pertemuan5.guided;

public class DemoFunction {
    public static void main(String[] args) {
        drawTriangle(5);
        drawSquare(6, 6);
    }

    public static void drawTriangle(int length) {
        for (int row = 0; row <= length; row++) {
            for (int column = 0; column < row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawSquare(int length, int width) {
        for (int row = 1; row <= length; row++) {
            for (int column = 1; column <= width; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
