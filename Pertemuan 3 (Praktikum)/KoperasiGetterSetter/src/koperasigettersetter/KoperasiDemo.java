
package koperasigettersetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("syukri", "sidokerto");
        System.out.println("Simpanan "+anggota1.getNama()+" : Rp."+anggota1.getSimpanan());
        anggota1.setNama("Awang");
        anggota1.setAlamat("Sidoarjo");
        anggota1.setor(100000);
        System.out.println("Simpanan "+anggota1.getNama()+" : Rp."+anggota1.getSimpanan());
        
        anggota1.pinjam(5000);
        System.out.println("Simpanan "+anggota1.getNama()+" : Rp."+anggota1.getSimpanan());
    }
}
