package Percobaan1;

public class Inheritance1 {

    public static void main(String[] args) {
        Manager m = new Manager();
        m.nama = "awang";
        m.alamat = "sidoarjo";
        m.umur = 19;
        m.jk = "pria";
        m.gaji = 5000000;
        m.tunjangan = 2000000;
        m.tampilDataManager();

        Staff s = new Staff();
        s.nama = "rita";
        s.alamat = "sidoarjo";
        s.umur = 21;
        s.jk = "perempuan";
        s.gaji = 3000000;
        s.lembur = 500000;
        s.potongan = 100000;
        s.tampilDataStaff();

        StaffTetap st = new StaffTetap("budi", "malang", "pria", 20, 2000000, 250000, 200000, "2A", 100000);
        st.tampilStaffTetap();

        StaffHarian sh = new StaffHarian("indah", "malang", "perempuan", 27, 10000, 100000, 50000, 100);
        sh.tampilStaffHarian();
    }
}
