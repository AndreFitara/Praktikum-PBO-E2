/*
 * Nama File : LambdaMap.java
 * Deskripsi : Implementasi lambda pada Map, digunakan untuk menampilkan key dan value
 * Pembuat   : Andre Fitara Agun Ni'am Muta'ali
 * Tanggal   : 05/06/2025
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map dengan NIM sebagai key dan Nama Mahasiswa sebagai value
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121140129", "Adi");
        mahasiswaMap.put("24060121140130", "Bambang");
        mahasiswaMap.put("24060121140131", "Cici");
        mahasiswaMap.put("24060121140132", "Didi");

        // Menampilkan key dan value menggunakan ekspresi lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
