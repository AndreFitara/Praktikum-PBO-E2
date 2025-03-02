/*
* Nama File : Mahasiswa.java
* Deskripsi : Mahasiswa dengan NIM, nama, prodi, daftar mata kuliah yang diambil, dosen wali, serta kendaraan yang dimiliki (jika ada)
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 27/02/2025
*/

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    public void setDosenWali(Dosen dosenWali) { 
        this.dosenWali = dosenWali; 
    }

    public void setKendaraan(Kendaraan kendaraan) { 
        this.kendaraan = kendaraan; 
    }

    public void addMatKul(MataKuliah matKul) { 
        listMatKul.add(matKul); 
    }

    public int getJumlahMatKul() { 
        return listMatKul.size(); 
    }

    public int getJumlahSKS() {
        int totalSks = 0;
        for (MataKuliah mk : listMatKul) {
            totalSks += mk.getSks();
        }
        return totalSks;
    }
    
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Tidak ada"));
        System.out.println("Kendaraan: " + (kendaraan != null ? kendaraan.getNoPlat() + " - " + kendaraan.getJenis() : "Tidak ada"));
        System.out.println("Mata Kuliah yang Diambil:");
        for (MataKuliah mk : listMatKul) {
            System.out.println("- " + mk.getNama());
        }
    }
}