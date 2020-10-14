package com.erie.Tugas2.No2;

public class Ikan extends Binatang {
    public String nama = "Ikan";

    public void getNama(){
        System.out.println("Nama\t: "+nama);
        System.out.println(makan);
        System.out.println(tidur);
    }

    public void berenang(){
        System.out.println("blub-blub imma go swim");
    }
}
