package Awang.Kuis.Kuis1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        Scanner angka = new Scanner(System.in);
        boolean luar = true;
        while (luar) {
            System.out.println("KELUARGA KURANG JAGO");
            System.out.print("Masukan gender (p/l) : ");
            String gender = text.nextLine();
            if (gender.equals("p")) {
                Wanita w = new Wanita();
                System.out.print("Masukan nama : ");
                String nama = text.nextLine();
                System.out.print("Masukan umur : ");
                int umur = angka.nextInt();
                if (w.penentu(umur) == true) {
                    System.out.println("Masukan data suami");
                    System.out.print("Masukan nama : ");
                    String nama1 = text.nextLine();
                    System.out.print("Masukan umur : ");
                    int umur1 = angka.nextInt();
                    System.out.println("Masukan data anak");
                    System.out.print("Masukan nama : ");
                    String nama2 = text.nextLine();
                    System.out.print("Masukan umur : ");
                    int umur2 = angka.nextInt();
                    Pria p = new Pria();
                    p.setNama(nama1);
                    p.setUmur(umur1);
                    p.setDewasa(p.penentu(umur1));
                    Manusia a = new Manusia(umur2, nama2, false);
                    Wanita w1 = new Wanita(umur, nama, w.penentu(umur), p, a);
                    w1.info(umur1);
                    System.out.println("info anak : ");
                    a.info();
                } else {
                    Wanita w1 = new Wanita(umur, nama, w.penentu(umur), null, null);
                    w1.info(0);
                }
            } else if (gender.equals("l")) {
                Pria p = new Pria();
                System.out.print("Masukan nama : ");
                String nama = text.nextLine();
                System.out.print("Masukan umur : ");
                int umur = angka.nextInt();
                if (p.penentu(umur) == true) {
                    System.out.println("Masukan data istri");
                    System.out.print("Masukan nama : ");
                    String nama1 = text.nextLine();
                    System.out.print("Masukan umur : ");
                    int umur1 = angka.nextInt();
                    Wanita w = new Wanita();
                    w.setNama(nama1);
                    w.setUmur(umur1);
                    w.setDewasa(w.penentu(umur1));
                    Pria p1 = new Pria(umur, nama, p.penentu(umur), w);
                    p1.info(umur);
                } else {
                    Pria p1 = new Pria(umur, nama, p.penentu(umur), null);
                    p1.info(0);
                }
            } else {
                System.out.println("inputan anda salah!!!");
            }
            boolean ulang = true;
            while (ulang) {
                System.out.print("Ulang Program (y/t) : ");
                String lagi = text.nextLine();
                if (lagi.equals("y")) {
                    ulang = false;
                } else if (lagi.equals("t")) {
                    ulang = false;
                    luar = false;
                } else {
                    System.out.println("Inputan Anda Salah!!!");
                }
            }
        }
    }
}
