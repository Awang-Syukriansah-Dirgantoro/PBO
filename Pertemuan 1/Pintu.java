
public class Pintu {
    private int tinggi;
    private int lebar;
    
    public void setTinggi(int newValue){
        tinggi = newValue;
    }
    
    public void setLebar(int newValue){
        lebar = newValue;
    }
    
    public void cetakStatus(){
        System.out.println("tinggi pintu = "+ tinggi);
        System.out.println("Lebar pintu = "+ lebar);
    }
}
