package id.ac.uph.pbo.pertemuan01;

public class Kendaraan {
    protected String merek;
    protected int    kecepatan;

    public Kendaraan(String merek) {
        this.merek     = merek;
        this.kecepatan = 0;
    }

    public void jalan() {
        kecepatan = 60;
        System.out.println("[Kendaraan:" + merek + "] Melaju " + kecepatan + " km/j");
    }

    public void berhenti() {
        kecepatan = 0;
        System.out.println("[Kendaraan:" + merek + "] Berhenti.");
    }
}
