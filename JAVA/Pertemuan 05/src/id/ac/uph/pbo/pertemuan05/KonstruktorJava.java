package id.ac.uph.pbo.pertemuan05;

public class KonstruktorJava {

    // Demo nilai default Java
    static void demoNilaiDefault() {
        System.out.println("\n─── NILAI DEFAULT TIPE DATA DI JAVA ─────────");
        // Deklarasi tanpa inisialisasi → Java set nilai default
        // (hanya untuk atribut class, BUKAN variabel lokal)
        System.out.println("  int      → 0");
        System.out.println("  double   → 0.0");
        System.out.println("  boolean  → false");
        System.out.println("  char     → '\\u0000' (null char)");
        System.out.println("  Object   → null");
        System.out.println("  String   → null");
    }

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PERTEMUAN 5 – Konstruktor Default & Non-Default ║");
        System.out.println("╚══════════════════════════════════════════════╝");

        // ─── Demo MataKuliah ──────────────────────────────────────────────
        System.out.println("\n═══ DEMO: Konstruktor MataKuliah ═══");
        System.out.println("Membuat objek dengan konstruktor berbeda:\n");
        MataKuliah mk1 = new MataKuliah();                          // default
        MataKuliah mk2 = new MataKuliah("SYS07406", "PBO");        // 2-param
        MataKuliah mk3 = new MataKuliah("SYS07301", "Basis Data", 3); // 3-param
        MataKuliah mk4 = new MataKuliah("SYS07100", "Kalkulus", 3, "Wajib", 60.0); // lengkap
        MataKuliah mk5 = new MataKuliah(mk4);                       // copy constructor

        System.out.println("\nDaftar Mata Kuliah:");
        System.out.printf("  %-12s | %-40s | SKS | Tipe     | Min%n", "Kode", "Nama");
        System.out.println("  " + "─".repeat(80));
        mk1.tampilkan();
        mk2.tampilkan();
        mk3.tampilkan();
        mk4.tampilkan();
        mk5.tampilkan();

        // ─── Demo Mahasiswa ─────────────────────────────────────────────
        System.out.println("\n═══ DEMO: Konstruktor Mahasiswa Overloading ═══");
        Mahasiswa m1 = new Mahasiswa("25SI001", "Budi");
        Mahasiswa m2 = new Mahasiswa("25SI002", "Sari", "Teknik Informatika");
        Mahasiswa m3 = new Mahasiswa("25SI003", "Andi", "Sistem Informasi", 2024, 3.85);

        m1.setIpk(3.50);

        System.out.printf("  %-12s | %-20s | %-20s | Tahun | IPK%n", "NIM", "Nama", "Prodi");
        System.out.println("  " + "─".repeat(80));
        m1.tampilkan();
        m2.tampilkan();
        m3.tampilkan();

        // ─── Nilai default ────────────────────────────────────────────────
        demoNilaiDefault();

        System.out.println("\n─── KESIMPULAN ──────────────────────────────");
        System.out.println("  Konstruktor Default     : dipanggil tanpa argumen");
        System.out.println("  Konstruktor Non-Default : minimal 1 argumen");
        System.out.println("  Overloading Konstruktor : banyak konstruktor, parameter beda");
        System.out.println("  this(...)               : memanggil konstruktor lain di class sama");
        System.out.println("  Copy Constructor        : membuat salinan objek lain");
    }
}
