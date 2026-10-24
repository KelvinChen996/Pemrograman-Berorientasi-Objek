package id.ac.uph.pbo.pertemuan10;

public class Balok extends BangunRuang {
    private double p, l, t;
    Balok(double p, double l, double t) { super("Balok"); this.p=p; this.l=l; this.t=t; }

    @Override public double hitungVolume()         { return p * l * t; }
    @Override public double hitungLuasPermukaan()  { return 2*(p*l + p*t + l*t); }
}
