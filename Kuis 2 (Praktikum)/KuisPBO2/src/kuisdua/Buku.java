package kuisdua;

public class Buku extends MediaInformasi {

    @Override
    public void setJMLHalaman(int jml) {
        jmlHalaman = jml;
        System.out.println("Buku ini memiliki : " + jmlHalaman + " halaman");
        System.out.println("Jika di hitung dengan covernya, maka jumlah halaman dari buku tersebut: " + (jmlHalaman + 4) + " halaman"
                + ", lebih tebal dari majalah kerena terdapat cover dalam dan cover luar");
    }

    @Override
    public void reputasi() {
        System.out.println("Penerbit buku ini bereputasi!");
    }
}
