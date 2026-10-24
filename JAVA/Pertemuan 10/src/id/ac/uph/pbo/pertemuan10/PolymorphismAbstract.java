package id.ac.uph.pbo.pertemuan10;

public class PolymorphismAbstract {

    // Method menerima BangunRuang – tidak peduli subclass apa
    static void cetakSemua(BangunRuang[] daftar) {
        System.out.println("  " + "─".repeat(65));
        System.out.printf("  %-17s | %-14s | %-14s%n", "Nama", "Volume", "Luas Permukaan");
        System.out.println("  " + "─".repeat(65));
        for (BangunRuang b : daftar) b.tampilkanHasil();
        System.out.println("  " + "─".repeat(65));
    }

    // Method polimorfik: terima Payable (interface) – tidak peduli implementasinya
    static void prosesTagihan(Payable[] dompet, double tagihan) {
        System.out.printf("Tagihan: Rp%,.0f%n", tagihan);
        for (Payable p : dompet) {
            boolean ok = p.bayar(tagihan);
            System.out.println("    Status: " + (ok ? "Berhasil" : "Gagal"));
        }
    }

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PERTEMUAN 10 – Polymorphism & Abstract Class ║");
        System.out.println("╚══════════════════════════════════════════════╝");

        // ─── Abstract Class: BangunRuang ──────────────────────────────
        System.out.println("\n═══ ABSTRACT CLASS – BangunRuang ═══");
        // BangunRuang br = new BangunRuang("test"); // ERROR! abstract tidak bisa diinstansiasi
        BangunRuang[] bangunList = {
            new Kubus(5),
            new Balok(4, 3, 6),
            new BolaRuang(7),
            new Tabung(4, 10),
            new Kerucut(3, 8)
        };
        cetakSemua(bangunList);

        // ─── Polymorphism: panggil metode sama, hasil beda ────────────
        System.out.println("\n═══ POLYMORPHISM – Dynamic Dispatch ═══");
        for (BangunRuang b : bangunList) {
            System.out.printf("  Volume %s: %.2f%n", b.getNama(), b.hitungVolume());
        }

        // ─── Abstract Class + Interface: Sistem Pembayaran ─────────────
        System.out.println("\n═══ ABSTRACT CLASS + INTERFACE – Pembayaran ═══");
        BasePayment[] dompet = {
            new KartuDebit("Budi", "1234-5678-9012-3456", 5_000_000),
            new GopayWallet("Sari", "08123456789", 2_000_000),
            new KartuDebit("Andi", "9876-5432-1098-7654", 500_000)   // saldo kurang
        };

        System.out.println("Info semua dompet:");
        for (BasePayment p : dompet) System.out.println("  " + p.getInfo());

        System.out.println("\nProses pembayaran Rp1.500.000:");
        prosesTagihan(dompet, 1_500_000);

        System.out.println("\nRefund ke Budi:");
        dompet[0].refund(500_000);

        // ─── Perbandingan Abstract Class vs Interface ─────────────────
        System.out.println("\n─── ABSTRACT CLASS vs INTERFACE ─────────────");
        System.out.printf("  %-28s %-28s%n", "Abstract Class", "Interface");
        System.out.println("  " + "─".repeat(56));
        System.out.printf("  %-28s %-28s%n", "Bisa punya field biasa", "Hanya konstanta (final)");
        System.out.printf("  %-28s %-28s%n", "Bisa punya concrete method", "Default method (Java 8+)");
        System.out.printf("  %-28s %-28s%n", "Satu class, satu parent", "Bisa implements banyak");
        System.out.printf("  %-28s %-28s%n", "IS-A relationship", "CAN-DO relationship");
        System.out.printf("  %-28s %-28s%n", "extends", "implements");
    }
}
