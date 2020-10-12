package Tugas;

public class Dosen extends Pegawai {

    public int jumlahSKS, TarifSKS = 100000;

    public Dosen() {

    }

    public Dosen(String nama, String nip, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    public int getGaji() {
        int totalGaji = jumlahSKS * TarifSKS;
        return totalGaji + super.getGaji();
    }
}
