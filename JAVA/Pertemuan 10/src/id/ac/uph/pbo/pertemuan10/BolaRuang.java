package id.ac.uph.pbo.pertemuan10;

public class BolaRuang extends BangunRuang {
    private double r;
    BolaRuang(double r) { super("Bola"); this.r = r; }

    @Override public double hitungVolume()         { return (4.0/3) * Math.PI * r*r*r; }
    @Override public double hitungLuasPermukaan()  { return 4 * Math.PI * r*r; }
}
