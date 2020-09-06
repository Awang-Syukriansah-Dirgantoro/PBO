
public class Sarung {
    private String merek;
    private String ukuran;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    
    public void setUkuran(String newValue){
        ukuran = newValue;
    }
    
    public void cetakStatus(){
        System.out.println("Merek: " + merek);
        System.out.println("ukuran: " + ukuran);
    }
}
