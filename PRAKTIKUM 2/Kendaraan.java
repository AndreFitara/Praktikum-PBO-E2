/*
 * Nama File : Kendaraan.java
 * Deskripsi : Objek kendaraan yang dimiliki oleh mahasiswa, dengan atribut nomor plat dan jenis kendaraan (motor atau mobil).
 * Pembuat   : Andre Fitara Agun Ni'am Muta'ali
 * Tanggal   : 27/02/2025
 */

 public class Kendaraan {
    private String noPlat;  // Nomor plat kendaraan
    private String jenis;   // Jenis kendaraan (motor/mobil)

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        setJenis(jenis); // Menggunakan setter agar validasi jenis kendaraan berlaku
    }

    // Getter untuk noPlat
    public String getNoPlat() { 
        return noPlat; 
    }

    // Getter untuk jenis kendaraan
    public String getJenis() { 
        return jenis; 
    }

    // Setter untuk noPlat
    public void setNoPlat(String noPlat) { 
        this.noPlat = noPlat; 
    }

    // Setter untuk jenis kendaraan dengan validasi
    public void setJenis(String jenis) { 
        if (jenis.equalsIgnoreCase("motor") || jenis.equalsIgnoreCase("mobil")) {
            this.jenis = jenis; 
        } else {
            System.out.println("Jenis Kendaraan harus 'motor' atau 'mobil'.");
        }
    }
}
