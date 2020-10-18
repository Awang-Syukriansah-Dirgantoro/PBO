package Tugas;

public class Pc extends Komputer {

    public int ukuranMonitor;

    public Pc() {

    }

    public Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        System.out.println("PC KURANG JAGO");
        super.tampilData();
        System.out.println("Ukuran monitor      : " + ukuranMonitor);
    }
}
