package Tugas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        Scanner angka = new Scanner(System.in);
        boolean luar = true;
        while (luar) {
            System.out.println("First Input");
            System.out.print("Nama Pilot   : ");
            String pilot1 = text.nextLine();
            System.out.print("Umur Pilot   : ");
            String pilot2 = text.nextLine();
            System.out.print("Nama CoPilot : ");
            String coPilot1 = text.nextLine();
            System.out.print("Umur CoPilot : ");
            String coPilot2 = text.nextLine();
            Pegawai pilot = new Pegawai(pilot1, pilot2);
            Pegawai coPilot = new Pegawai(coPilot1, coPilot2);
            boolean penumpang = true;
            String kode[] = {"A", "B", "C", "D", "E"};
            int x = 0, nomor = 1;
            while (penumpang) {
                System.out.println("KURANG JAGO CHECK IN PESAWAT");
                System.out.print("Masukan nama anda : ");
                String nama = text.nextLine();
                System.out.print("Masukan nomor ktp : ");
                String ktp = text.nextLine();
                System.out.print("Masukan tujuan    : ");
                String tujuan = text.nextLine();
                Penumpang p = new Penumpang(ktp, nama, tujuan);
                Maskapai ms = new Maskapai("KURANG JAGO AIRLANES", kode[x], 36, pilot, coPilot);
                if (x == 5) {
                    x = 0;
                    nomor++;
                } else {
                    x++;
                }
                ms.setPenumpang(p, nomor);
                System.out.println(ms.info(nomor));
                boolean ulang = true;
                while (ulang) {
                    System.out.print("Check in penumpang lain (y/t)? ");
                    String lagi = text.nextLine();
                    if (lagi.equals("t")) {
                        ulang = false;
                        penumpang = false;
                        luar = false;
                    } else if (lagi.equals("y")) {
                        ulang = false;
                    } else {
                        System.out.println("Inputan anda salah");
                    }
                }
            }
        }
    }
}
