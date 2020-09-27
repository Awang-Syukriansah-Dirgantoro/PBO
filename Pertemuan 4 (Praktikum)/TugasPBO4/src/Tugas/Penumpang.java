package Tugas;

public class Penumpang {

    private String ktp, nama, tujuan;

    public Penumpang(String ktp, String nama, String tujuan) {
        this.nama = nama;
        this.ktp = ktp;
        this.tujuan = tujuan;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getKtp() {
        return ktp;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "" + nama + "\n";
        info += "Ktp       : " + ktp + "\n";
        info += "Tujuan    : " + tujuan + "\n";
        return info;
    }
}
