package Tugas;

public class Pegawai {

    private String nama, umur;

    Pegawai(String nama, String umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getUmur() {
        return umur;
    }

    public String info() {
        String info = "";
        info += "" + this.nama + "\n";
        info += "Umur      : " + this.umur;
        return info;
    }
}
