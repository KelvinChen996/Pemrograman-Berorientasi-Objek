package id.ac.uph.pbo.pertemuan06;

public class OverloadingOverriding {

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PERTEMUAN 6 – Overloading & Overriding      ║");
        System.out.println("╚══════════════════════════════════════════════╝");

        // ─── OVERLOADING ──────────────────────────────────────────────────
        System.out.println("\n═══ METHOD OVERLOADING ═══");
        Kalkulator kalk = new Kalkulator();

        System.out.println("hitungLuas() – nama sama, parameter berbeda:");
        System.out.printf("  Persegi (s=5)               : %.2f%n", kalk.hitungLuas(5));
        System.out.printf("  Persegi Panjang (8 x 4)     : %.2f%n", kalk.hitungLuas(8, 4));
        System.out.printf("  Segitiga (a=6, t=3)         : %.2f%n", kalk.hitungLuas(6, 3, "segitiga"));
        System.out.printf("  Lingkaran (r=7)             : %.2f%n", kalk.hitungLuas(7, true));

        System.out.println("\ncetak() – overloading tipe parameter:");
        kalk.cetak(42);
        kalk.cetak(3.14);
        kalk.cetak("Halo Dunia");
        kalk.cetak(true);

        System.out.println("\nPerbedaan Overloading vs Overriding:");
        System.out.println("  Overloading : dalam CLASS YANG SAMA, parameter beda, compile-time");
        System.out.println("  Overriding  : antar PARENT-CHILD class, signature sama, runtime");

        // ─── OVERRIDING ───────────────────────────────────────────────────
        System.out.println("\n═══ METHOD OVERRIDING ═══");
        Anjing anjing = new Anjing("Rex", "Golden Retriever");
        Kucing kucing = new Kucing("Mimi", true);
        Burung burung = new Burung("Tweety", 500);

        System.out.println("bersuara() – setiap subclass punya perilaku sendiri:");
        anjing.bersuara();
        kucing.bersuara();
        burung.bersuara();

        System.out.println("\nmakan() – Kucing meng-override + memanggil super.makan():");
        anjing.makan();   // dari Hewan (tidak di-override)
        kucing.makan();   // di-override, tapi panggil super.makan() juga

        System.out.println("\ninfo() – Anjing panggil super.info() lalu tambah info sendiri:");
        anjing.info();

        System.out.println("\nMethod khusus subclass:");
        anjing.ajakJalan();
        burung.terbang();

        // ─── Polymorphism via referensi Hewan ────────────────────────────
        System.out.println("\n═══ POLIMORFISME MELALUI REFERENSI PARENT ═══");
        Hewan[] kebunBinatang = { anjing, kucing, burung,
                new Anjing("Buddy", "Poodle"),
                new Burung("Eagle", 2000) };

        System.out.println("Semua hewan bersuara (dipanggil lewat tipe Hewan):");
        for (Hewan h : kebunBinatang) {
            h.bersuara();   // Dynamic dispatch → method subclass yang dipanggil
        }
    }
}
