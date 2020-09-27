package Tugas;

public class Maskapai {

    private String nama, kode;
    private Pegawai pilot, coPilot;
    private Kursi arrayKursi[];

    Maskapai(String nama, String kode, int jumlah, Pegawai pilot, Pegawai coPilot) {
        this.nama = nama;
        this.pilot = pilot;
        this.coPilot = coPilot;
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPilot(Pegawai pilot) {
        this.pilot = pilot;
    }

    public void setCoPilot(Pegawai coPilot) {
        this.coPilot = coPilot;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }

    public String getNama() {
        return nama;
    }

    public Pegawai getPilot() {
        return pilot;
    }

    public Pegawai getCoPilot() {
        return coPilot;
    }

    public String getKode() {
        return kode;
    }

    public Kursi getArrayKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            return arrayKursi[i];
        }
        return null;
    }

    public String info(int nomor) {
        String info = "";
        info += "Maskapai  : " + this.nama + "\n";
        info += "Pegawai \n";
        info += "Pilot     : " + this.pilot.info() + "\n";
        info += "CoPilot   : " + this.coPilot.info() + "\n";
        info += "Penumpang \n";
        info += "Kode      : " + kode + "\n";
        Kursi kursi = arrayKursi[nomor - 1];
        info += kursi.info();
        return info;
    }
}
