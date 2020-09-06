
public class Kasur {
    private String merek;
    private int panjang;
    private int lebar;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    
    public void setPanjang(int newValue){
        panjang = newValue;
    }
    
    public void setLebar(int newValue){
        lebar = newValue;
    }
    
    public void cetakStatus(){
        System.out.println("Merek : " + merek);
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
    }
}
