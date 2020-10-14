package com.erie.Tugas2.No2;

public class BinatangRun {
    public static void main(String[] args) {
        Burung subclass1 = new Burung();
        Ikan subclass2 = new Ikan();
        Kucing subclass3 = new Kucing();

        System.out.println("Wellcome to the zoo~~~");
        System.out.println("We have all kinds of wild lives");
        System.out.println();
        subclass1.getNama();
        subclass1.terbang();
        System.out.println();
        subclass2.getNama();
        subclass2.berenang();
        System.out.println();
        subclass3.getNama();
        subclass3.meong();
    }
}
