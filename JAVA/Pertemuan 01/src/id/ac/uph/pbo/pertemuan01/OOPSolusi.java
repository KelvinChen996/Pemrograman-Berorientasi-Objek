package id.ac.uph.pbo.pertemuan01;

public class OOPSolusi {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PENDEKATAN OOP – Solusi dengan Enkapsulasi ║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        // ── Membuat objek dari class Mahasiswa ───────────────────────────────
        Mahasiswa mhs1 = new Mahasiswa("Budi Santoso",  "220301001", 3.50);
        Mahasiswa mhs2 = new Mahasiswa("Sari Wulandari","220301002", 3.75);
        Mahasiswa mhs3 = new Mahasiswa("Andi Pratama",  "220301003", 2.90);

        System.out.println("Data Mahasiswa yang baru dibuat:");
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
        mhs3.tampilkanInfo();

        // ── Demonstrasi method perilaku ──────────────────────────────────────
        System.out.println();
        mhs1.belajar();
        mhs2.hadirKuliah("Pemrograman Berorientasi Objek");

        // ── Mencoba mengubah IPK dengan nilai TIDAK VALID ────────────────────
        System.out.println("\n── Mencoba mengubah IPK Andi ke -99.0 (tidak valid): ──");
        mhs3.setIpk(-99.0);           // ditolak oleh validasi setter
        System.out.print("  IPK Andi setelah percobaan: ");
        System.out.printf("%.2f (tidak berubah)%n", mhs3.getIpk());

        // ── Mengubah IPK dengan nilai VALID ─────────────────────────────────
        System.out.println("\n── Mengubah IPK Andi ke 3.10 (valid): ──");
        mhs3.setIpk(3.10);
        System.out.print("  IPK Andi sekarang: ");
        System.out.printf("%.2f%n", mhs3.getIpk());

        System.out.println("\n── Data akhir semua mahasiswa: ──");
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
        mhs3.tampilkanInfo();

        System.out.println("\n──────────────────────────────────────────────────");
        System.out.println("KESIMPULAN: Enkapsulasi melindungi data IPK lewat");
        System.out.println("           setter yang tervalidasi – data aman!");
        System.out.println("──────────────────────────────────────────────────");
    }
}
