package id.ac.uph.pbo.pertemuan01;

public class SegitigaSiku extends BangunDatar {
    private double alas, tinggi, sisiMiring;
    public SegitigaSiku(double alas, double tinggi) {
        super("Segitiga Siku-Siku");
        this.alas       = alas;
        this.tinggi     = tinggi;
        this.sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
    }
    @Override public double hitungLuas()     { return 0.5 * alas * tinggi; }
    @Override public double hitungKeliling() { return alas + tinggi + sisiMiring; }
}
