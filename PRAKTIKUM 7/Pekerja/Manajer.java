/*
* Nama File : Manajer.java
* Deskripsi : Class manajer
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 24/04/2025
*/

class Manager extends Pegawai {
    private int tunjangan = 700000;

    public Manager(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
