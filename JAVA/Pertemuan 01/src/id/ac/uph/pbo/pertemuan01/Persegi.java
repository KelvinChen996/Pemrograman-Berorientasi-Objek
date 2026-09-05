package id.ac.uph.pbo.pertemuan01;

public class Persegi extends BangunDatar {
    private double sisi;
    public Persegi(double sisi) {
        super("Persegi");
        this.sisi = sisi;
    }
    @Override public double hitungLuas()     { return sisi * sisi; }
    @Override public double hitungKeliling() { return 4 * sisi; }
}
