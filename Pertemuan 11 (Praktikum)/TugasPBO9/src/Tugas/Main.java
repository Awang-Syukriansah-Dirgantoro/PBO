package Tugas;

public class Main {

    public static void main(String[] args) {
        System.out.println("KURANG JAGO HEWAN HEWAN");
        System.out.println("");

        Singa singa = new Singa("CingaCing", 4, "Roaar Roaar", "Coklat");
        Keledai keledai = new Keledai("Kedelai", 4, "Hehehe", "Abu-Abu");
        Gorilla gorilla = new Gorilla("Gulali", 4, "Hauuum Hauum", "Hitam Manis");

        keledai.displayBinatang();
        keledai.displayMakan();
        keledai.displayData();
        System.out.println();

        gorilla.displayBinatang();
        gorilla.displayMakan();
        gorilla.displayData();
        System.out.println();

        singa.displayBinatang();
        singa.displayMakan();
        singa.displayData();

    }
}
