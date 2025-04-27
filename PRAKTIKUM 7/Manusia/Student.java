/*
* Nama File : Student.java
* Deskripsi : Class Student
* Pembuat   : Andre Fitara Agun Ni'am Muta'ali
* Tanggal   : 24/04/2025
*/

public class Student extends Person {
    public Student (String name){
        super(name);
    }

    public boolean isAsleep(int hr){
        return hr > 2 && hr < 8;
    }
}
