/**
 * File      : MainDAO.java
 * Deskripsi : Program utama untuk demonstrasi DAO
 * Pembuat   : Andre Fitara Agun Ni'am Muta'ali
 * Tanggal   : 15/05/2025
 */
public class MainDAO {
    public static void main(String[] args) {
       Person person = new Person("Indra");
       DAOManager m = new DAOManager();
       m.setPersonDao(new MySQLPersonDAO());
       try{
        m.getPersonDAO().savePerson(person);
       }catch(Exception e) {
        e.printStackTrace();
       }
    }
}