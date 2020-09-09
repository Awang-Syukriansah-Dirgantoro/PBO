
public class Main {
    public static void main(String[] args) {
        Sarung srg1 = new Sarung();
        Kasur ksr1 = new Kasur();
        Pintu pnt1 = new Pintu();
        PintuKamarTidur pnt2 = new PintuKamarTidur();
        PintuKamarMandi pnt3 = new PintuKamarMandi();
        
        srg1.setMerek("Wadimor");
        srg1.setUkuran("L");
        srg1.cetakStatus();
        
        ksr1.setMerek("Lovely");
        ksr1.setPanjang(3);
        ksr1.setLebar(2);
        ksr1.cetakStatus();
        
        pnt1.setLebar(1);
        pnt1.setTinggi(2);
        pnt1.cetakStatus();
        
        pnt2.setLebar(1);
        pnt2.setTinggi(3);
        pnt2.setBahan("kayu jati");
        pnt2.setMotif("kotak kotak");
        pnt2.cetakStatus();
        
        pnt3.setLebar(1);
        pnt3.setTinggi(3);
        pnt3.setBahan("plastic");
        pnt3.cetakStatus();
    }
}
