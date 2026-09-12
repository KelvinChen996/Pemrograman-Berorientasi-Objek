package id.ac.uph.pbo.pertemuan04;

public class EnkapsulasiDesainClass {

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PERTEMUAN 4 – Enkapsulasi & Desain Class    ║");
        System.out.println("╚══════════════════════════════════════════════╝");

        // ─── Demo RekeningTabungan ────────────────────────────────────────
        System.out.println("\n═══ DEMO: RekeningTabungan (Enkapsulasi) ═══");
        RekeningTabungan rek = new RekeningTabungan("BCA-001-2025", "Budi Santoso", 5_000_000);
        rek.cetakInfo();

        System.out.println("\nTransaksi:");
        rek.setor(2_500_000);
        rek.setor(1_000_000);
        rek.tarik(800_000);
        rek.tarik(20_000_000);   // saldo tidak cukup
        rek.tarik(-500);         // invalid
        System.out.println("\nSetelah semua transaksi:");
        rek.cetakInfo();

        // ─── Demo Karyawan ─────────────────────────────────────────
        System.out.println("\n═══ DEMO: Karyawan (SRP + Validasi) ═══");
        Karyawan k1 = new Karyawan("EMP-001", "Sari Wulandari", "Software Engineer", 8_000_000);
        Karyawan k2 = new Karyawan("EMP-002", "Andi Pratama", "Project Manager", 12_000_000);
        Karyawan k3 = new Karyawan("EMP-003", "Rina", "Intern", 1_500_000); // di bawah minimum

        k1.tambahLembur(5);
        k2.tambahLembur(10);

        System.out.println("\nSlip Gaji:");
        k1.cetakSlipGaji();
        k2.cetakSlipGaji();

        // ─── Prinsip Desain ────────────────────────────────────────────────
        System.out.println("\n═══ PRINSIP DESAIN CLASS ═══");
        System.out.println("  SRP (Single Responsibility Principle):");
        System.out.println("    Setiap class memiliki SATU tanggung jawab utama.");
        System.out.println("    RekeningTabungan → urus data & transaksi rekening SAJA.");
        System.out.println("    Karyawan  → urus data & penggajian karyawan SAJA.");
        System.out.println();
        System.out.println("  High Cohesion  : Method di dalam class saling berkaitan erat.");
        System.out.println("  Low Coupling   : Class tidak bergantung berlebihan satu sama lain.");
        System.out.println("  Enkapsulasi    : private + getter/setter + validasi.");
    }
}
