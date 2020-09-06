
public class PintuKamarTidur extends Pintu{
    private String bahan;
    private String motif;
    
    public void setBahan(String newValue){
        bahan = newValue;
    }
    
    public void setMotif(String newValue){
        motif = newValue;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("bahan pintu = " + bahan);
        System.out.println("motif pintu = " + motif);
    }
}
