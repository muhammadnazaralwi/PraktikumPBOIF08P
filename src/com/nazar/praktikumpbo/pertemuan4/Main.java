package com.nazar.praktikumpbo.pertemuan4;

public class Main {
    public static void main(String[] args) {
        Buku matematika = new Buku();
        Buku ipa = new Buku();
        Buku komik = new Buku();

        matematika.judul = "Matematika Kelas 12";
        matematika.pengarang = "Pak Dedy";
        matematika.jumlahHalaman = 400;
        matematika.sampul = "Plastik";

        System.out.println(matematika.judul);
        System.out.println(matematika.pengarang);
        System.out.println(matematika.jumlahHalaman);
        System.out.println(matematika.sampul);

        Mobil avanza = new Mobil();
        avanza.merk = "Avanza";
        avanza.jumlahBan = 4;
        avanza.jenis = "Mobil Keluarga";

        System.out.println(avanza.merk);
        System.out.println(avanza.jumlahBan);
        System.out.println(avanza.jenis);

    }
}
