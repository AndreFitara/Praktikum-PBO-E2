/*
* Nama File : AngkaSialException.java
* Deskripsi : Program penggunaan eksepsi menggunakan class library java
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 7/03/2025
*/

public class ExceptionOnArray {
    public static void main(String[] args) {
        // Instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; // Baris ini akan menyebabkan ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}