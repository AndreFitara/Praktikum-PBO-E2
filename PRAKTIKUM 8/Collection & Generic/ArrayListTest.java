/**
* File      : ArrayListTest.java
* Deskripsi : program penggunaan objek ArrayList sebagai Collection class
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 01/05/2025
*/

import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args){
        //initialisasi ArrayList yang hanya dapat
        //berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //menghapus elemen
        strings.remove("praktikum");
        //iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.print(s+ " ");
        }
    }
}
