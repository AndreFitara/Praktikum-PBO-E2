/**
 * File      : Person.java
 * Deskripsi : Kelas model untuk entitas Person
 * Pembuat   : Andre Fitara Agun Ni'am Muta'ali
 * Tanggal   : 15/05/2025
 */
public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }
}
