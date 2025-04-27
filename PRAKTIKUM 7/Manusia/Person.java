/*
* Nama File : Person.java
* Deskripsi : Class Person
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 24/04/2025
*/

public class Person {
    private String name;

    public Person(String name) { this.name = name;}
    public boolean isAsleep(int hr) {return hr > 22 || hr < 7;}
    public String toString() {return name;}

    public void status( int hr){
        if (this.isAsleep(hr)){
            System.out.println("Now offline :" + this);
        }
         else{
            System.out.println("Now Online :" + this);
        }
    }
}