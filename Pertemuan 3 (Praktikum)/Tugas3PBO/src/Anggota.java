
public class Anggota {

    private int limit, pinjam;
    private String nama, nik;

    Anggota(String nik, String nama, int limit) {
        this.nik = nik;
        this.nama = nama;
        this.limit = limit;
        this.pinjam = 0;
    }

    public void pinjam(int pinjam) {
        if (pinjam > limit) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
            this.pinjam += 0;
        } else {
            if ((this.pinjam + pinjam) > limit) {
                System.out.println("Maaf, jumlah pinjaman melebihi limit");
                this.pinjam += 0;
            } else {
                this.pinjam += pinjam;
            }
        }
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjam() {
        return limit;
    }

    public int getJumlahPinjaman() {
        return pinjam;
    }

    public void angsur(int angsur) {
        if (pinjam > 0) {
            if (angsur >= (pinjam * 10 / 100)) {
                if ((pinjam - angsur) >= 0) {
                    pinjam -= angsur;
                } else {
                    System.out.println("maaf, angsuran anda berlebih");
                }
            } else {
                System.out.println("Maaf angsuran harus 10% dari jumlah pinjam");
            }
        } else {
            System.out.println("maaf, pinjaman anda Rp.0");
        }
    }

}
