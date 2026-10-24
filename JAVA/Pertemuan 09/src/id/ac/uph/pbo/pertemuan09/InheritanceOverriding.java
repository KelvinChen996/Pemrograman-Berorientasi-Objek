package id.ac.uph.pbo.pertemuan09;

public class InheritanceOverriding {

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PERTEMUAN 9 – Inheritance & Overriding      ║");
        System.out.println("╚══════════════════════════════════════════════╝");

        // ─── Membuat objek dari berbagai level ─────────────────────────
        System.out.println("\n═══ OBJEK DARI BERBAGAI LEVEL INHERITANCE ═══");
        MobilBase     sedan  = new MobilBase("Toyota","Camry", 2024, 550_000_000, 4);
        MotorBase     moto   = new MotorBase("Honda","CB500F", 2023, 95_000_000, 2);
        MobilSUV      suv    = new MobilSUV("Mitsubishi","Pajero Sport", 2024, 680_000_000, true);
        KendaraanListrik ev  = new KendaraanListrik("BYD","Atto 3", 2024, 490_000_000, 60);
        MobilListrikTesla ts = new MobilListrikTesla("Model 3", 2025, 850_000_000);

        // ─── info() – setiap class punya implementasi sendiri ──────────
        System.out.println("info() tiap kendaraan:");
        sedan.info();
        moto.info();
        suv.info();
        ev.info();
        ts.info();

        // ─── Upcasting: referensi parent, objek child ──────────────────
        System.out.println("\n═══ UPCASTING (Referensi KendaraanBase) ═══");
        KendaraanBase[] garasi = { sedan, moto, suv, ev, ts };
        for (KendaraanBase k : garasi) {
            k.nyalakan();   // Dynamic dispatch: method subclass yang jalan
        }

        // ─── Downcasting ───────────────────────────────────────────────
        System.out.println("\n═══ DOWNCASTING ═══");
        KendaraanBase kendaraan = new MobilSUV("Toyota","Fortuner", 2024, 550_000_000, true);
        if (kendaraan instanceof MobilSUV) {
            MobilSUV downcast = (MobilSUV) kendaraan;
            downcast.aktifkan4WD();   // method khusus MobilSUV
        }

        // ─── super keyword ─────────────────────────────────────────────
        System.out.println("\n═══ SUPER KEYWORD ═══");
        System.out.println("SUV info (super.info() + info tambahan):");
        suv.info();

        // ─── final class ───────────────────────────────────────────────
        System.out.println("\n═══ FINAL CLASS – Tesla tidak bisa di-extend ═══");
        ts.aktifkanAutopilot();
        ts.cas(2.5);

        // ─── Multi-level summary ────────────────────────────────────────
        System.out.println("\n─── HIERARKI INHERITANCE ─────────────────────");
        System.out.println("  KendaraanBase");
        System.out.println("  ├── MobilBase       extends KendaraanBase");
        System.out.println("  │   └── MobilSUV    extends MobilBase");
        System.out.println("  ├── MotorBase        extends KendaraanBase");
        System.out.println("  └── KendaraanListrik extends KendaraanBase");
        System.out.println("      └── MobilListrikTesla (final)");
    }
}
