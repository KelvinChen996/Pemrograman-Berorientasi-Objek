package id.ac.uph.pbo.pertemuan07;

public class RelasiAntarClass {

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PERTEMUAN 7 – Relasi Antar Class            ║");
        System.out.println("╚══════════════════════════════════════════════╝");

        // ─── DEPENDENCY ─────────────────────────────────────────────────
        System.out.println("\n═══ DEPENDENCY (USES-A) ═══");
        Printer   printer  = new Printer();
        SMSGateway sms     = new SMSGateway();

        // ─── ASSOCIATION ────────────────────────────────────────────────
        System.out.println("\n═══ ASSOCIATION (HAS-A) ═══");
        Alamat  alamat1 = new Alamat("Jl. Merdeka No.1", "Medan", "Sumatera Utara", "20111");
        Pelanggan cust1 = new Pelanggan("C001", "Budi Santoso", alamat1);
        cust1.info();

        // ─── COMPOSITION ────────────────────────────────────────────────
        System.out.println("\n═══ COMPOSITION (Order HAS OrderItem) ═══");
        Order order = new Order("ORD-20250001", cust1, 10);
        order.tambahItem("Laptop ASUS",    1, 8_500_000);
        order.tambahItem("Mouse Logitech", 2,   350_000);
        order.tambahItem("USB Hub",        1,   150_000);
        order.cetakStruk(printer);       // Dependency: pakai Printer sementara
        order.konfirmasi(sms);           // Dependency: pakai SMSGateway sementara

        // ─── AGGREGATION ────────────────────────────────────────────────
        System.out.println("\n═══ AGGREGATION (Departemen HAS Karyawan) ═══");
        Karyawan k1 = new Karyawan("Sari", "Developer");
        Karyawan k2 = new Karyawan("Andi", "QA Engineer");
        Karyawan k3 = new Karyawan("Rina", "DevOps");

        Departemen it = new Departemen("IT Department", 10);
        it.tambahAnggota(k1);
        it.tambahAnggota(k2);
        it.tambahAnggota(k3);
        it.tampilkan();
        // k1, k2, k3 tetap ada meski dept dibubarkan → aggregation

        // ─── REALIZATION ────────────────────────────────────────────────
        System.out.println("\n═══ REALIZATION (implements Bayar) ═══");
        Bayar[] metode = {
            new BayarKartuKredit("4111-1111-1111-4567"),
            new BayarDompetDigital("GoPay-Budi", 5_000_000)
        };
        double tagihan = 9_350_000;
        System.out.printf("Tagihan: Rp%,.0f%n", tagihan);
        for (Bayar b : metode) {
            System.out.println("Metode: " + b.getMetodePembayaran());
            b.prosesPembayaran(tagihan);
        }

        // ─── Ringkasan ────────────────────────────────────────────────
        System.out.println("\n─── RINGKASAN RELASI ANTAR CLASS ────────────");
        System.out.println("  USES-A   Dependency   : Order pakai Printer (sementara)");
        System.out.println("  HAS-A    Association  : Pelanggan punya Alamat");
        System.out.println("  HAS-A    Composition  : Order punya OrderItem (kuat)");
        System.out.println("  HAS-A    Aggregation  : Dept punya Karyawan (lemah)");
        System.out.println("  IS-A     Realization  : BayarKartu implements Bayar");
    }
}
