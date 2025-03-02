/*
* Nama File : MataKuliah.java
* Deskripsi : Mata kuliah dengan ID, nama, dan jumlah SKS
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 27/02/2025
*/

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatKul() { 
        return idMatKul; 
    }

    public String getNama() { 
        return nama; 
    }

    public int getSks() { 
        return sks; 
    }

    public void setIdMatKul(String idMatKul) { 
        this.idMatKul = idMatKul; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public void setSks(int sks) { 
        this.sks = sks; 
    }
}
