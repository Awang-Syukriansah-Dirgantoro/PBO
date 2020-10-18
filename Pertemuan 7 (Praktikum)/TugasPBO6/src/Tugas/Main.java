package Tugas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        Scanner angka = new Scanner(System.in);
        Pc pc = new Pc();
        Mac mac = new Mac();
        Windows wnd = new Windows();
        boolean luar = true;
        while (luar) {
            System.out.println("LIST KOMPUTER KURANG JAGO");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Exit");
            System.out.print("Pilihan anda (1-3): ");
            int pilih = angka.nextInt();
            switch (pilih) {
                case 1:
                    boolean tambah = true;
                    while (tambah) {
                        System.out.println("");
                        System.out.println("TAMBAH KOMPUTER KURANG JAGO");
                        System.out.println("Nb: Setiap pilihan hanya menampung 1 data");
                        System.out.println("1. Pc");
                        System.out.println("2. Mac");
                        System.out.println("3. Windows");
                        System.out.println("4. Back");
                        System.out.print("Pilihan anda (1-4): ");
                        int pilih2 = angka.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.println("");
                                System.out.print("Merek          : ");
                                String merk = text.nextLine();
                                pc.merk = merk;
                                System.out.print("Speed prosesor : ");
                                int spdProsessor = angka.nextInt();
                                pc.kecProsesor = spdProsessor;
                                System.out.print("Besar memory   : ");
                                int memori = angka.nextInt();
                                pc.sizeMemory = memori;
                                System.out.print("Jenis Prosesor : ");
                                String jenis = text.nextLine();
                                pc.jnsProsesor = jenis;
                                System.out.print("Ukuran Monitor : ");
                                int ukuran = angka.nextInt();
                                pc.ukuranMonitor = ukuran;
                                System.out.println("Sedang Diproses....");
                                break;
                            case 2:
                                System.out.println("");
                                System.out.print("Merek          : ");
                                merk = text.nextLine();
                                mac.merk = merk;
                                System.out.print("Speed prosesor : ");
                                spdProsessor = angka.nextInt();
                                mac.kecProsesor = spdProsessor;
                                System.out.print("Besar memory   : ");
                                memori = angka.nextInt();
                                mac.sizeMemory = memori;
                                System.out.print("Jenis Prosesor : ");
                                jenis = text.nextLine();
                                mac.jnsProsesor = jenis;
                                System.out.print("Jenis Baterai  : ");
                                String baterai = text.nextLine();
                                mac.jnsBatrei = baterai;
                                System.out.print("Security       : ");
                                String keamanan = text.nextLine();
                                mac.security = keamanan;
                                System.out.println("Sedang Diproses....");
                                break;
                            case 3:
                                System.out.println("");
                                System.out.print("Merek          : ");
                                merk = text.nextLine();
                                wnd.merk = merk;
                                System.out.print("Speed prosesor : ");
                                spdProsessor = angka.nextInt();
                                wnd.kecProsesor = spdProsessor;
                                System.out.print("Besar memory   : ");
                                memori = angka.nextInt();
                                wnd.sizeMemory = memori;
                                System.out.print("Jenis Prosesor : ");
                                jenis = text.nextLine();
                                System.out.print("Jenis Baterai  : ");
                                baterai = text.nextLine();
                                wnd.jnsBatrei = baterai;
                                wnd.jnsProsesor = jenis;
                                System.out.print("Fitur          : ");
                                String fitur = text.nextLine();
                                wnd.fitur = fitur;
                                System.out.println("Sedang Diproses....");
                                break;
                            case 4:
                                tambah = false;
                                break;

                            default:
                                System.out.println("Inputan anda salah");
                                break;
                        }
                    }
                    break;
                case 2:
                    boolean tampil = true;
                    while (tampil) {
                        System.out.println("");
                        System.out.println("TAMPIL KOMPUTER KURANG JAGO");
                        System.out.println("Nb: Setiap pilihan hanya menampung 1 data");
                        System.out.println("1. Pc");
                        System.out.println("2. Mac");
                        System.out.println("3. Windows");
                        System.out.println("4. Back");
                        System.out.print("Pilihan anda (1-4): ");
                        int pilih2 = angka.nextInt();
                        switch (pilih2) {
                            case 1:
                                pc.tampilPc();
                                break;
                            case 2:
                                mac.tampilMac();
                                break;
                            case 3:
                                wnd.tampilWindows();
                                break;
                            case 4:
                                tampil = false;
                                break;

                            default:
                                System.out.println("Inputan anda salah");
                                break;
                        }
                    }
                    break;
                case 3:
                    luar = false;
                    break;

                default:
                    System.out.println("Inputan anda salah");
            }
        }
    }
}
