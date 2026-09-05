package id.ac.uph.pbo.pertemuan01;

public class PersegiPanjang {
    private double panjang, lebar;
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang; this.lebar = lebar;
    }
    public double hitungLuas()     { return panjang * lebar; }
    public double hitungKeliling() { return 2 * (panjang + lebar); }
    public void cetak() {
        System.out.printf("  PersegiPanjang (%.1fx%.1f): Luas=%.2f, Keliling=%.2f%n",
                panjang, lebar, hitungLuas(), hitungKeliling());
    }
}
