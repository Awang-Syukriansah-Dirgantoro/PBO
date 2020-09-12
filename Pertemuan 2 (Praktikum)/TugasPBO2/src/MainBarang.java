
import java.util.Scanner;

public class MainBarang {

    public static void main(String[] args) {
        Scanner awang = new Scanner(System.in);
        Barang brg = new Barang();
        System.out.print("Masukan nama barang : ");
        brg.namaBarang = awang.next();
        System.out.print("Masukan kode barang : ");
        brg.kode = awang.next();
        System.out.print("Masukan harga dasar : ");
        brg.hargaDasar = awang.nextInt();
        System.out.print("Masukan diskon      : ");
        brg.diskon = awang.nextFloat();
        brg.tampilData();
    }
}
