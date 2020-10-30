package Tugas;

public class MainSegitiga {

    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("KURANG JAGO SUDUT 1");
        s.totalSudut(50);
        s.infoSudut();
        System.out.println("KURANG JAGO SUDUT 2");
        s.totalSudut(21, 13);
        s.infoSudut();
        System.out.println("KURANG JAGO KELILING 1");
        s.keliling(3, 25, 18);
        s.infoSudut();
        System.out.println("KURANG JAGO KELILING 2");
        s.keliling(8, 12);
        s.infoSudut();

    }
}
