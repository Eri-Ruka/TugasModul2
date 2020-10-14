package com.erie.Tugas2.No1;

public class club {
    public String nama = "Club";
    public int tahun = 2000;
    public String stadion = "Lapangan";
    public int juara = 1;
    public String deskrip = "Begitulah";

    //Overloading
    public club(){}

    public club(String nama) {
        this.nama = nama;
    }

    public club(String nama, int tahun) {
        this.nama = nama;
        this.tahun = tahun;
    }

    public club(String nama, int tahun, String stadion) {
        this.nama = nama;
        this.tahun = tahun;
        this.stadion = stadion;
    }

    public club(String nama, int tahun, String stadion, int juara, String deskrip) {
        this.nama = nama;
        this.tahun = tahun;
        this.stadion = stadion;
        this.juara = juara;
        this.deskrip = deskrip;
    }

    public void getData(){
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Tahun\t\t: "+tahun);
        System.out.println("Stadion\t\t: "+stadion);
        System.out.println("Juara\t\t: "+juara);
        System.out.println("Deskripsi\t: "+deskrip);
        System.out.println();
    }
}