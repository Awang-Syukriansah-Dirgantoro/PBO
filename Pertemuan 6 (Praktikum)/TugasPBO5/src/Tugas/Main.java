package Tugas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner text = new Scanner(System.in);
        Scanner angka = new Scanner(System.in);
        System.out.println("Banyak pegawai hanya 10");
        DaftarGaji gaji = new DaftarGaji(10);
        boolean luar = true;
        while (luar) {
            System.out.println("KURANG JAGO PEGAWAI");
            System.out.println("1) Daftar Pegawai");
            System.out.println("2) Daftar Dosen");
            System.out.println("3) List Gaji");
            System.out.println("4) Keluar");
            System.out.print("Pilih : ");
            int pilih = angka.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukan Nama   : ");
                    String nama = text.nextLine();
                    System.out.print("Masukan Nip    : ");
                    String nip = text.nextLine();
                    System.out.print("Masukan Alamat : ");
                    String alamat = text.nextLine();
                    Pegawai pegawai = new Pegawai(nama, nip, alamat);
                    gaji.addPegawai(pegawai);
                    break;

                case 2:
                    System.out.print("Masukan Nama   : ");
                    nama = text.nextLine();
                    System.out.print("Masukan Nip    : ");
                    nip = text.nextLine();
                    System.out.print("Masukan Alamat : ");
                    alamat = text.nextLine();
                    System.out.print("Banyak SKS     : ");
                    int sks = angka.nextInt();
                    System.out.println("Bonus Per sks = 100000");
                    Dosen dosen = new Dosen(nama, nip, alamat);
                    dosen.setSKS(sks);
                    gaji.addPegawai(dosen);
                    break;

                case 3:
                    gaji.info();
                    break;

                case 4:
                    luar = false;
                    break;

                default:
                    System.out.println("Inputan anda salah!!!!");
            }
        }
    }
}
