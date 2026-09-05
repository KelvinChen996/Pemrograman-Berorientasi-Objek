package id.ac.uph.pbo.pertemuan01;

public class JamTangan {
    private String merek;
    private String model;
    private int    jam;
    private int    menit;
    private boolean waterResistant;

    public JamTangan(String merek, String model, boolean waterResistant) {
        this.merek          = merek;
        this.model          = model;
        this.waterResistant = waterResistant;
        this.jam            = 7;
        this.menit          = 0;
    }

    public void setWaktu(int jam, int menit) {
        if (jam >= 0 && jam < 24 && menit >= 0 && menit < 60) {
            this.jam   = jam;
            this.menit = menit;
            System.out.printf("[Jam %s] Waktu diatur: %02d:%02d%n", merek, jam, menit);
        }
    }

    public void tampilkanWaktu() {
        System.out.printf("[Jam %s] Waktu sekarang: %02d:%02d%n", merek, jam, menit);
    }

    public void aktifkanAlarm(int jamAlarm, int menitAlarm) {
        System.out.printf("[Jam %s] Alarm diset: %02d:%02d ⏰%n",
                merek, jamAlarm, menitAlarm);
    }

    public void tampilkanInfo() {
        System.out.println("  Jam       : " + merek + " " + model);
        System.out.printf ("  Waktu     : %02d:%02d%n", jam, menit);
        System.out.println("  WR        : " + (waterResistant ? "Ya" : "Tidak"));
    }
}
