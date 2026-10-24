package id.ac.uph.pbo.pertemuan10;

public class Kubus extends BangunRuang {
    private double sisi;
    Kubus(double sisi) { super("Kubus"); this.sisi = sisi; }

    @Override public double hitungVolume()         { return sisi * sisi * sisi; }
    @Override public double hitungLuasPermukaan()  { return 6 * sisi * sisi; }
}
