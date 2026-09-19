package id.ac.uph.pbo.pertemuan05;

public class MataKuliah {
    private String kode;
    private String nama;
    private int    sks;
    private String tipe;     // "Wajib" / "Pilihan"
    private double nilaiMin; // nilai minimum lulus

    // ── Konstruktor Default (no-arg) ─────────────────────────────────────────
    // Dipakai ketika belum ada data → set nilai awal
    MataKuliah() {
        this.kode    = "UNKNOWN";
        this.nama    = "Belum Ditentukan";
        this.sks     = 2;
        this.tipe    = "Wajib";
        this.nilaiMin = 55.0;
        System.out.println("  [Konstruktor Default] MataKuliah dibuat dengan nilai awal.");
    }

    // ── Konstruktor Non-Default (2 parameter) ────────────────────────────────
    MataKuliah(String kode, String nama) {
        this(kode, nama, 2, "Wajib", 55.0);   // panggil konstruktor lengkap via this()
        System.out.println("  [Konstruktor 2-param] " + kode + " – " + nama);
    }

    // ── Konstruktor Non-Default (3 parameter) ────────────────────────────────
    MataKuliah(String kode, String nama, int sks) {
        this(kode, nama, sks, "Wajib", 55.0);
        System.out.println("  [Konstruktor 3-param] " + kode + " – " + nama + " (" + sks + " sks)");
    }

    // ── Konstruktor Lengkap (5 parameter) ────────────────────────────────────
    MataKuliah(String kode, String nama, int sks, String tipe, double nilaiMin) {
        this.kode    = kode;
        this.nama    = nama;
        this.sks     = (sks > 0) ? sks : 2;
        this.tipe    = tipe;
        this.nilaiMin = nilaiMin;
    }

    // ── Copy Constructor ──────────────────────────────────────────────────────
    MataKuliah(MataKuliah lain) {
        this(lain.kode, lain.nama, lain.sks, lain.tipe, lain.nilaiMin);
        System.out.println("  [Copy Constructor] Salinan dari: " + lain.kode);
    }

    // Getter
    String getKode()   { return kode; }
    String getNama()   { return nama; }
    int    getSks()    { return sks; }
    String getTipe()   { return tipe; }

    void tampilkan() {
        System.out.printf("  %-12s | %-40s | %d sks | %-8s | Min: %.0f%n",
                kode, nama, sks, tipe, nilaiMin);
    }
}
