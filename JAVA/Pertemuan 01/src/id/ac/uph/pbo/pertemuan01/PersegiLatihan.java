package id.ac.uph.pbo.pertemuan01;

public class PersegiLatihan {
    private double sisi;
    public PersegiLatihan(double sisi) { this.sisi = sisi; }
    public double hitungLuas()     { return sisi * sisi; }
    public double hitungKeliling() { return 4 * sisi; }
    public void cetak() {
        System.out.printf("  Persegi (sisi=%.1f): Luas=%.2f, Keliling=%.2f%n",
                sisi, hitungLuas(), hitungKeliling());
    }
}
