
package Tugas;

public class Lingkaran extends BangunDatar{
    public float r;
    
    public float luas(){
        float luas = (float) (Math.PI * r * r);
        return luas;
    }
    
    public float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        return keliling;
    }
}
