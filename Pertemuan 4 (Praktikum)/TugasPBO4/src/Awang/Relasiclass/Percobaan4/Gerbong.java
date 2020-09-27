package Awang.Relasiclass.Percobaan4;

public class Gerbong {

    private String kode;
    private Kursi arrayKursi[];

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        for (int i = 0; i < arrayKursi.length; i++) {
            if (arrayKursi[i].getPenumpang() == null) {
                this.arrayKursi[i].setPenumpang(penumpang);
                break;
            }  
        }
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

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
