package Tugas;

public class DaftarGaji {

    Pegawai listPegawai[];

    public DaftarGaji(int jumlah) {
        this.listPegawai = new Pegawai[jumlah];
    }

    public void addPegawai(Pegawai pegawai) {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                this.listPegawai[i] = pegawai;
                break;
            }
        }
    }

    public void info() {
        System.out.println("Daftar Pegawai");
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                break;
            } else {
                System.out.println("Nama   : " + listPegawai[i].nama);
                System.out.println("Nip    : " + listPegawai[i].nip);
                System.out.println("Alamat : " + listPegawai[i].alamat);
                System.out.println("Gaji   : " + listPegawai[i].getGaji());
                System.out.println("====================================");
            }
        }
    }
}
