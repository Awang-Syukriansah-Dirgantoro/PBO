
public class PintuKamarMandi extends Pintu{
    private String bahan;
    
    public void setBahan(String newValue){
        bahan = newValue;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("bahan pintu = " + bahan);
    }
}
