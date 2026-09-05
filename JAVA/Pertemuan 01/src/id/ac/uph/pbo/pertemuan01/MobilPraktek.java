package id.ac.uph.pbo.pertemuan01;

public class MobilPraktek {

    // Atribut
    private String merek;
    private String warna;
    private int    kecepatan;

    // Constructor
    public MobilPraktek(String merek, String warna) {
        this.merek      = merek;
        this.warna      = warna;
        this.kecepatan  = 0;
    }

    // Method: jalan
    public void jalan() {
        kecepatan = 60;
        System.out.println(merek + " melaju " + kecepatan + " km/j");
    }

    // Method: berhenti
    public void berhenti() {
        kecepatan = 0;
        System.out.println(merek + " berhenti");
    }

    // Method: klakson
    public void klakson() {
        System.out.println(merek + ": Beep Beep!");
    }

    // Method: tampilkan detail
    public void info() {
        System.out.println("  Merek     : " + merek);
        System.out.println("  Warna     : " + warna);
        System.out.println("  Kecepatan : " + kecepatan + " km/j");
    }
}
