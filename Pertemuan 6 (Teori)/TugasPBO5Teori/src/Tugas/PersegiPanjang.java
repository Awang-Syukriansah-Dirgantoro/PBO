
package Tugas;

public class PersegiPanjang extends BangunDatar{
    public float panjang, lebar;
    
    public float luas(){
        float luas = panjang * lebar;
        return luas;
    }
    
    public float keliling(){
        float keliling = 2*panjang + 2*lebar;
        return keliling;
    }
}
