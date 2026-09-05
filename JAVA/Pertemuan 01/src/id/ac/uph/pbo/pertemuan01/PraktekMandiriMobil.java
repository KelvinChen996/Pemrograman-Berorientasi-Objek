package id.ac.uph.pbo.pertemuan01;

public class PraktekMandiriMobil {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PRAKTEK MANDIRI – Program OOP Pertama       ║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        // ── Membuat dua objek dari class MobilPraktek ────────────────────────
        MobilPraktek m1 = new MobilPraktek("Honda", "Putih");
        MobilPraktek m2 = new MobilPraktek("Yamaha", "Hitam");

        System.out.println("── Output sesuai slide: ──");
        m1.jalan();       // Honda melaju 60 km/j
        m2.jalan();       // Yamaha melaju 60 km/j
        m1.berhenti();    // Honda berhenti

        System.out.println("\n── Info state masing-masing objek: ──");
        System.out.println("Objek m1 (Honda):");
        m1.info();
        System.out.println("Objek m2 (Yamaha):");
        m2.info();

        // ── Eksperimen tambahan ──────────────────────────────────────────────
        System.out.println("\n── Eksperimen: klakson & jalan lagi ──");
        m2.klakson();
        m2.berhenti();
        m1.klakson();

        // ── Membuat objek ketiga ─────────────────────────────────────────────
        System.out.println("\n── Membuat objek ke-3: ──");
        MobilPraktek m3 = new MobilPraktek("Toyota", "Merah");
        m3.jalan();
        m3.klakson();
        m3.berhenti();

        System.out.println("\n──────────────────────────────────────────────────");
        System.out.println("KEY TAKEAWAY:");
        System.out.println("  • m1, m2, m3 dibuat dari class yang SAMA");
        System.out.println("  • Masing-masing menyimpan state sendiri (merek, warna, kecepatan)");
        System.out.println("  • Method dipanggil lewat titik (dot): m1.jalan()");
        System.out.println("──────────────────────────────────────────────────");
    }
}
