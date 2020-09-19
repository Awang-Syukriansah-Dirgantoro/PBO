import java.util.Scanner;
public class TestKoperasi {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        boolean luar = true;
        while (luar) {    
            System.out.println("PT Pinjam Meminjam Kurang Jago");
            System.out.print("Masukan Nama : ");
            String nama = text.nextLine();
            System.out.print("Masukan NIK  : ");
            String nik = text.nextLine();
            System.out.println("Anda di beri limit pinjam Rp.5000000");
            Anggota donny = new Anggota(nik, nama, 5000000);
            boolean tengah = true;
            while(tengah){
                System.out.print("Masukan pinjaman : Rp.");
                int pinjam = angka.nextInt();
                donny.pinjam(pinjam);
                if (donny.getJumlahPinjaman() > 0) {
                    System.out.println("Nama     : " + donny.getNama());
                    System.out.println("Limit    : Rp." + donny.getLimitPinjam());
                    System.out.println("Pinjaman : Rp." + donny.getJumlahPinjaman());
                    boolean dalam = true;
                    while(dalam){
                        System.out.println("Waktunya Mengangsur");
                        System.out.print("Masukan angsuran : Rp.");
                        int angsur = angka.nextInt();
                        donny.angsur(angsur);
                        System.out.println("Pinjaman : Rp." + donny.getJumlahPinjaman());
                        System.out.println("");
                        if (donny.getJumlahPinjaman() == 0) {
                            dalam = false;
                            tengah = false;
                        }
                    }
                }
            }
            boolean lagi = true;
            while(lagi){
                System.out.print("Buka pinjaman baru (y/t)? ");
                    String ulang = text.nextLine();
                    if (ulang.equals("t")) {
                        luar = false;
                        lagi = false;
                    } else if (ulang.equals("y")) {
                        lagi = false;
                    } else {
                        System.out.println("Inputan anda salah!!!");
                    }
            }
        }
    }
}
