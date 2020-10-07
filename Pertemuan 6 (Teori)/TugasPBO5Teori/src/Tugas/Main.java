
package Tugas;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 10;
        persegiPanjang.lebar = 5;
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 10;
        
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 20;
        segitiga.tinggi = 15;
        
        bangunDatar.luas();
        System.out.println("Luas Persegi Panjang :" + persegiPanjang.luas());
        System.out.println("Luas Lingkaran       :" + lingkaran.luas());
        System.out.println("Luas Segitiga        :" + segitiga.luas());
        System.out.println("");
        bangunDatar.keliling();
        System.out.println("Keliling Persegi Panjang :" + persegiPanjang.keliling());
        System.out.println("Keliling Lingkaran       :" + lingkaran.keliling());
        System.out.println("Keliling Segitiga        :" + segitiga.keliling());
    }
}
