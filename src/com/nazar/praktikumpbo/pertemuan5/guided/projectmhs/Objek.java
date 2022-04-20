package com.nazar.praktikumpbo.pertemuan5.guided.projectmhs;

public class Objek {
    public static void main(String[] args) {
        Mahasiswa irfani = new Mahasiswa("Muhammad Irfani", 123);

//        irfani.setNama("Muhammad Irfani");
//        irfani.setNim(123);
//        irfani.nama = "Muhammad Irfani";
//        irfani.nim = 123;

        System.out.println("Nama: " + irfani.getNama());
        System.out.println("NIM: " + irfani.getNim());
//        System.out.println("Nama: " + irfani.nama);
//        System.out.println("NIM: " + irfani.nim);

        Mahasiswa nazar = new Mahasiswa();
    }
}
