package kuisdua;

public class MediaInformasi implements Penerbit {

    public int jmlHalaman;
    private int tahunSekarang;

    public int getTahunSekarang(int tahun) {
        tahunSekarang = tahun;
        return tahun;
    }

    public void setJMLHalaman(int jml) {
        jmlHalaman = jml;
    }

    @Override
    public void reputasi() {
        System.out.println("Penerbit ini bereputasi!");
    }

    @Override
    public void alamatPenerbit(String alamat) {
        System.out.println("Alamat penerbit : " + alamat);
    }

    @Override
    public void tahunBerdiri(int tahun) {
        System.out.println("Penerbit ini berdiri pada tahun " + tahun
                + ", sehingga penerbit ini sekarang berusia: " + (tahunSekarang - tahun) + " tahun");
    }
}
