package Praktikum1;

public class Mahasiswa implements ICumlaude {

    protected String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    @Override
    public void kuliahDiKampus() {
        System.out.println("Aku mahasiswa,Namaku " + this.nama);
        System.out.println("Aku berkuliah di Polinema");
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah lulus");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,00");
    }
}
