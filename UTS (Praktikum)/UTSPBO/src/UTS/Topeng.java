package UTS;

public class Topeng extends Kerajinan {

    public Ornamen ornamen;

    Topeng(String asal, String namaKerajinan, Ornamen ornamen) {
        this.asal = asal;
        this.nama = namaKerajinan;
        this.ornamen = ornamen;
    }

    public void buatKerajinan() {
        harga = 1500000;
    }
}
