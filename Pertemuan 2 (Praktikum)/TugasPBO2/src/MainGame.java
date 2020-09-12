
import java.util.Scanner;

public class MainGame {

    public static void main(String[] args) {
        Scanner awang = new Scanner(System.in);
        Scanner awang2 = new Scanner(System.in);
        Game gm1 = new Game();
        System.out.println("Sewa Game Kurang Jago");
        System.out.println("=====================");
        System.out.println("List : ");
        System.out.println("1) GTA san andreas - 45.000");
        System.out.println("2) Most Wanted     - 30.000");
        System.out.println("3) Harvest Moon    - 20.000");
        System.out.print("Pilihan anda : ");
        int pilih = awang.nextInt();
        switch (pilih) {
            case 1:
                System.out.print("Lama menyewa (hari): ");
                int lama = awang.nextInt();
                gm1.hitungHarga(45000, lama);
                gm1.setNamaGame("GTA san andreas");
                break;
            case 2:
                System.out.print("Lama menyewa (hari): ");
                lama = awang.nextInt();
                gm1.hitungHarga(30000, lama);
                gm1.setNamaGame("Most Wanted");
                break;
            case 3:
                System.out.print("Lama menyewa (hari): ");
                lama = awang.nextInt();
                gm1.hitungHarga(20000, lama);
                gm1.setNamaGame("Harvest Moon");
                break;

            default:
                System.out.println("Inputan salah!!!");
                break;
        }
        if (pilih > 0 && pilih < 4) {
            System.out.print("masukan nama : ");
            String nama = awang2.nextLine();
            System.out.print("masukan id member : ");
            int id = awang.nextInt();
            gm1.setNama(nama);
            gm1.setId(id);
            gm1.cetak();
        }
    }
}
