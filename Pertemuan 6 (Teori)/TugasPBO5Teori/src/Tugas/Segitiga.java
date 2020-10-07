
package Tugas;

public class Segitiga extends BangunDatar{
    public float alas, tinggi;
    
    public float luas(){
        float luas =alas * tinggi / 2;
        return luas;
    }
    
    public float keliling(){
        float sisi = (float) ((Math.pow(tinggi,2)) -  (Math.pow(1/2*alas,2)));
        float keliling = sisi + sisi + alas;
        return keliling;
    }
}
