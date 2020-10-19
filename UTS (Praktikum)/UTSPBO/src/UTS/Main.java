package UTS;

public class Main {

    public static void main(String[] args) {
        Topeng topeng = new Topeng("Malang", "Topeng Malangan", new Ornamen(200000));
        topeng.buatKerajinan();
        System.out.println("Nama kerajinan          = " + topeng.nama);
        System.out.println("Asal                    = " + topeng.asal);
        System.out.println("Harga untuk membuat     = " + topeng.harga);
        topeng.perbaikiKerajinan();
        System.out.println("Harga untuk memperbaiki = " + topeng.harga);
        System.out.println("Harga ornamen           = " + topeng.ornamen.harga);
    }
}
