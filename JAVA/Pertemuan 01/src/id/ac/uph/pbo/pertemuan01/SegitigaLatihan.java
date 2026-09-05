package id.ac.uph.pbo.pertemuan01;

public class SegitigaLatihan {
    private double alas, tinggi, sisiA, sisiB, sisiC;
    public SegitigaLatihan(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas   = alas;   this.tinggi = tinggi;
        this.sisiA  = sisiA;  this.sisiB  = sisiB; this.sisiC = sisiC;
    }
    public double hitungLuas()     { return 0.5 * alas * tinggi; }
    public double hitungKeliling() { return sisiA + sisiB + sisiC; }
    public void cetak() {
        System.out.printf("  Segitiga (a=%.1f, t=%.1f): Luas=%.2f, Keliling=%.2f%n",
                alas, tinggi, hitungLuas(), hitungKeliling());
    }
}
