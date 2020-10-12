package Tugas;

public class Pegawai {

    public String nip, nama, alamat;

    public Pegawai() {

    }

    public Pegawai(String nama, String nip, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return 3000000;
    }
}
