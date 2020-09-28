package Awang.Kuis.Kuis1;

public class Pria extends Manusia {

    private Wanita istri;

    Pria() {

    }

    Pria(int umur, String nama, boolean dewasa, Wanita istri) {
        setUmur(umur);
        setNama(nama);
        setDewasa(dewasa);
        this.istri = istri;
    }

    public boolean penentu(int umur) {
        if (umur >= 22) {
            return true;
        } else {
            return false;
        }
    }

    public void info(int umur) {
        System.out.println("Info Pria :");
        super.info();
        if (getDewasa() == true) {
            System.out.println("Info Istri");
            if (istri.penentu(umur) == true) {
                istri.info();
                System.out.println("Status : Bersuami");
            } else {
                istri.info();
            }
        } else {
            System.out.println("Status : Masih Kuliah");
        }
    }
}
