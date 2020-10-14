package com.erie.Tugas2.No1;

public class RunClub {
    public static void main(String[] args) {
        club club1 = new club();
        club club2 = new club("Manchester");
        club club3 = new club("Chelsea", 2001);
        club club4 = new club("Barcelona", 2007, "El Clasico");
        club club5 = new club("Arsenal", 2003, "Old Trafford", 5, "Yaudah gitu");

        club1.getData();
        club2.getData();
        club3.getData();
        club4.getData();
        club5.getData();
    }
}
