
public class Barang {

    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        int hargaJual = hargaDasar - ((int) diskon * hargaDasar / 100);
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("kode = " + kode);
        System.out.println("nama barang = " + namaBarang);
        System.out.println("harga dasar = Rp." + hargaDasar);
        System.out.println("diskon = " + diskon + "%");
        System.out.println("harga jual = Rp." + hitungHargaJual());
    }
}
