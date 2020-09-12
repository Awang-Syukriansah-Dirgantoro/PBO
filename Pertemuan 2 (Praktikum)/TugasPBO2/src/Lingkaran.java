
public class Lingkaran {

    public double phi = 3.14;
    public double r;

    public double hitungLuas() {
        double luas = (phi * r) * (phi * r);
        return luas;
    }

    public double hitungKeliling() {
        double keliling = phi * (r * 2);
        return keliling;
    }
}
