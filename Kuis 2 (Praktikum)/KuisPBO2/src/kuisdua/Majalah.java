package kuisdua;

public class Majalah extends MediaInformasi {

    @Override
    public void setJMLHalaman(int jml) {
        jmlHalaman = jml;
        System.out.println("Majalah ini memiliki : " + jmlHalaman + " halaman");
        System.out.println("Jika di hitung dengan covernya, maka jumlah halaman dari majalah tersebut: " + (jmlHalaman + 2) + " halaman");
    }

    @Override
    public void reputasi() {
        System.out.println("Penerbit majalah ini bereputasi!");
    }
}
