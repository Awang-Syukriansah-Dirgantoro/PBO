package Awang.Kuis.Kuis1;

public class Wanita extends Manusia {

    private Pria suami;
    private Manusia anak;

    Wanita() {

    }

    Wanita(int umur, String nama, boolean dewasa, Pria suami, Manusia anak) {
        setUmur(umur);
        setNama(nama);
        setDewasa(dewasa);
        this.suami = suami;
        this.anak = anak;
    }

    public boolean penentu(int umur) {
        if (umur >= 20) {
            return true;
        } else {
            return false;
        }
    }

    public void info(int umur) {
        System.out.println("Info Wanita : ");
        super.info();
        if (getDewasa() == true) {
            System.out.println("Info Suami : ");
            if (suami.penentu(umur) == true) {
                suami.info();
                System.out.println("Status : Beristri");
            } else {
                suami.info();
            }
        } else {
            System.out.println("Status : Masih Kuliah");
        }
    }
}
