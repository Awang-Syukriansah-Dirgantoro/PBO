package Tugas;

public class MainManusia {

    public static void main(String[] args) {
        Manusia man = new Manusia();
        Dosen dos = new Dosen();
        Mahasiswa mah = new Mahasiswa();
        System.out.println("KURANG JAGO MANUSIA");
        man.makan();
        man.bernafas();
        System.out.println("KURANG JAGO DOSEN");
        man = dos;
        man.makan();
        dos.lembur();
        System.out.println("KURANG JAGO MAHASISWA");
        man = mah;
        man.makan();
        mah.tidur();
    }
}
