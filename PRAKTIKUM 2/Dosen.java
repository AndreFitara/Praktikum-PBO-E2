/*
* Nama File : Dosen.java
* Deskripsi : Seorang dosen yang memiliki NIP, nama, dan prodi
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 27/02/2025
*/

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip() { 
        return nip; 
    }

    public String getNama() { 
        return nama; 
    }

    public String getProdi() { 
        return prodi; 
    }

    public void setNip(String nip) {
        this.nip = nip; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public void setProdi(String prodi) { 
        this.prodi = prodi; 
    }
}
