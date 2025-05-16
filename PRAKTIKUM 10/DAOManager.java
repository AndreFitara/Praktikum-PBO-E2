/**
 * File      : DAOManager.java
 * Deskripsi : Pengelola DAO dalam program
 * Pembuat   : Andre Fitara Agun Ni'am Muta'ali
 * Tanggal   : 15/05/2025
 */

 public class DAOManager{
    private PersonDAO personDAO;

    public void setPersonDao (PersonDAO person) {
        personDAO = person;
    }
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
 }
