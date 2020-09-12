
public class Game extends Member{
    public String namaGame;
    public int harga;
    public int lamaSewa;
    
    public void hitungHarga(int bayar, int lama){
        lamaSewa=lama;
        harga = bayar*lamaSewa;
    }
    
    public void setNamaGame(String newValue){
        namaGame = newValue;
    }
    
    public void cetak(){
        System.out.println("===========================");
        super.cetak();
        System.out.println("===========================");
        System.out.println("Nama Game   : "+ namaGame);
        System.out.println("Lama Sewa   : "+ lamaSewa);
        System.out.println("Harga akhir : "+ harga);
    }
}
