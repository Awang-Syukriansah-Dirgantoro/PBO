import java.util.Scanner;
public class MainLingkaran {
    public static void main(String[] args) {
        Scanner awang = new Scanner(System.in);
        Lingkaran ling = new Lingkaran();
        System.out.println("Menghitung luas dan keliling");
        System.out.println("============================");
        System.out.print("Masukan jari jari : ");
        int jari = awang.nextInt();
        ling.r = jari;
        System.out.println("============================");
        System.out.println("luas lingkaran     : " + ling.hitungLuas());
        System.out.println("keliling lingkaran : " + ling.hitungKeliling());
    }
}
