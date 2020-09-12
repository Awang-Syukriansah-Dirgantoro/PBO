
public class Member {
    public String namaMember;
    public int idMember;
    
    public void setNama(String newValue){
        namaMember = newValue;
    }
    
    public void setId(int newValue){
        idMember = newValue;
    }
    
    public void cetak(){
        System.out.println("Nama : " + namaMember);
        System.out.println("Id   : " + idMember);
    }
}
