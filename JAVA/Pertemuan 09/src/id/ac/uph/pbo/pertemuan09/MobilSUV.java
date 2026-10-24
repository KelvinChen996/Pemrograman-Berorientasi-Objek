package id.ac.uph.pbo.pertemuan09;

public class MobilSUV extends MobilBase {
    private boolean has4WD;
    private double  ground_clearance;

    MobilSUV(String merek, String model, int tahun, double harga, boolean wd4) {
        super(merek, model, tahun, harga, 5);
        this.has4WD          = wd4;
        this.ground_clearance = 220.0;
    }

    @Override String getJenis() { return "Mobil SUV"; }

    void aktifkan4WD() {
        if (has4WD) System.out.println("  " + merek + " – 4WD diaktifkan! 🚙");
        else System.out.println("  " + merek + " – Tidak punya 4WD.");
    }

    @Override
    void info() {
        super.info();   // panggil info() dari parent
        System.out.println("    4WD: " + (has4WD ? "Ya" : "Tidak") +
                " | Clearance: " + ground_clearance + " mm");
    }
}
