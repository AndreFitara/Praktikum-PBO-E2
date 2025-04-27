/*
* Nama File : Programmer.java
* Deskripsi : Class programmer
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 24/04/2025
*/

class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println();
        System.out.println("Bonus : " + bonus);
    }
}