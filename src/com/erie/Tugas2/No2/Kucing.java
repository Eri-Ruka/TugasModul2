package com.erie.Tugas2.No2;

public class Kucing extends Binatang {
    public String nama = "Kucing";

    public void getNama(){
        System.out.println("Nama\t: "+nama);
        System.out.println(makan);
        System.out.println(tidur);
    }

    public void meong(){
        System.out.println("Meooooong");
    }
}
