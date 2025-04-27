/*
* Nama File : TestPolimorfisme.java
* Deskripsi : Class utama TestPolimorfisme
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 24/04/2025
*/

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Manager pegawai3 = new Manager("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/*
* Jawaban no. 2:
* Manfaat polimorfisme pada kasus ini adalah memudahkan pengelolaan objek berbeda tipe (Programmer, Manager)
* menggunakan satu referensi yang sama, yaitu Pegawai. Kita dapat memanggil method tampilData()
* tanpa perlu mengetahui tipe spesifik objek tersebut.
*/

/*
* Jawaban no. 3:
* Jika tidak menggunakan polimorfisme (inclusion), maka kita harus membuat list terpisah untuk tiap jenis pegawai
* atau melakukan pengecekan manual tipe objek (instanceof), yang membuat program menjadi lebih panjang,
* sulit dibaca, dan sulit dipelihara. Penambahan pegawai4 dan pegawai5 akan membutuhkan modifikasi besar tanpa polimorfisme.
*/