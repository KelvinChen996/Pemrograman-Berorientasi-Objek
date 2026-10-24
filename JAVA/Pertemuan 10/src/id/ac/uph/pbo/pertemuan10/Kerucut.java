package id.ac.uph.pbo.pertemuan10;

public class Kerucut extends BangunRuang {
    private double r, t;
    Kerucut(double r, double t) { super("Kerucut"); this.r=r; this.t=t; }

    double garisPelukis() { return Math.sqrt(r*r + t*t); }
    @Override public double hitungVolume()         { return (1.0/3)*Math.PI*r*r*t; }
    @Override public double hitungLuasPermukaan()  { return Math.PI*r*(r+garisPelukis()); }
}
