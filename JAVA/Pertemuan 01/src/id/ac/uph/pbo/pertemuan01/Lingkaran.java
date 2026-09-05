package id.ac.uph.pbo.pertemuan01;

public class Lingkaran extends BangunDatar {
    private double radius;
    public Lingkaran(double radius) {
        super("Lingkaran");
        this.radius = radius;
    }
    @Override public double hitungLuas()     { return Math.PI * radius * radius; }
    @Override public double hitungKeliling() { return 2 * Math.PI * radius; }
}
