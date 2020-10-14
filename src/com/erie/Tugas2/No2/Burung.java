package com.erie.Tugas2.No2;

public class Burung extends Binatang {
    public String nama = "Bumrung";

    public void getNama(){
        System.out.println("Nama\t: "+nama);
        System.out.println(makan);
        System.out.println(tidur);
    }

    public void terbang(){
        System.out.println("Imma fly wuiiiii");
    }
}
