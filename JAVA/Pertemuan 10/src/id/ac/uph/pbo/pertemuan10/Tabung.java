package id.ac.uph.pbo.pertemuan10;

public class Tabung extends BangunRuang {
    private double r, t;
    Tabung(double r, double t) { super("Tabung"); this.r=r; this.t=t; }

    @Override public double hitungVolume()         { return Math.PI * r*r * t; }
    @Override public double hitungLuasPermukaan()  { return 2*Math.PI*r*(r+t); }
}
