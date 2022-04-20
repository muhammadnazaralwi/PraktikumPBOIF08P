package com.nazar.praktikumpbo.pertemuan5.guided.projectmhs;

public class Mahasiswa {
    private String nama;
    private int nim;

    // overloading
    public Mahasiswa() {
    }

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}
