package id.ac.uph.pbo.pertemuan01;

public class LingkaranLatihan {
    private double radius;
    public LingkaranLatihan(double radius) { this.radius = radius; }
    public double hitungLuas()     { return Math.PI * radius * radius; }
    public double hitungKeliling() { return 2 * Math.PI * radius; }
    public void cetak() {
        System.out.printf("  Lingkaran (r=%.1f): Luas=%.2f, Keliling=%.2f%n",
                radius, hitungLuas(), hitungKeliling());
    }
}
