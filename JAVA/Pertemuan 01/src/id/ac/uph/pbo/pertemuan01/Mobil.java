package id.ac.uph.pbo.pertemuan01;

public class Mobil {

    // ── State (Atribut) ──────────────────────────────────────────────────────
    private String merek;
    private String warna;
    private int    kecepatan;          // km/jam
    private double jumlahBahanBakar;   // Liter

    // ── Constructor ──────────────────────────────────────────────────────────
    public Mobil(String merek, String warna, double bahanBakarAwal) {
        this.merek            = merek;
        this.warna            = warna;
        this.kecepatan        = 0;
        this.jumlahBahanBakar = bahanBakarAwal;
    }

    // ── Behavior (Method) ────────────────────────────────────────────────────
    public void jalan() {
        if (jumlahBahanBakar > 0) {
            kecepatan = 60;
            jumlahBahanBakar -= 5;   // konsumsi bahan bakar
            System.out.println("[" + merek + "] melaju " + kecepatan
                    + " km/j | BBM tersisa: " + jumlahBahanBakar + " L");
        } else {
            System.out.println("[" + merek + "] tidak bisa jalan – BBM habis!");
        }
    }

    public void berhenti() {
        kecepatan = 0;
        System.out.println("[" + merek + "] berhenti.");
    }

    public void klakson() {
        System.out.println("[" + merek + "] BEEP BEEP! 📯");
    }

    public void isiBahanBakar(double liter) {
        jumlahBahanBakar += liter;
        System.out.println("[" + merek + "] diisi BBM +" + liter
                + " L → total: " + jumlahBahanBakar + " L");
    }

    // ── Getter untuk menampilkan state ──────────────────────────────────────
    public void tampilkanState() {
        System.out.println("  Merek     : " + merek);
        System.out.println("  Warna     : " + warna);
        System.out.println("  Kecepatan : " + kecepatan + " km/j");
        System.out.println("  BBM       : " + jumlahBahanBakar + " L");
    }
}
