package id.ac.uph.pbo.pertemuan04;

public class Karyawan {
    // Atribut private
    private String  nik;
    private String  nama;
    private String  jabatan;
    private double  gajiPokok;
    private int     jamLembur;

    // Konstanta kelas
    static final double TARIF_LEMBUR   = 50_000;  // per jam
    static final double TARIF_BONUS    = 0.10;     // 10%
    static final double GAJI_MINIMUM   = 3_000_000;

    Karyawan(String nik, String nama, String jabatan, double gajiPokok) {
        this.nik       = nik;
        this.nama      = nama;
        this.jabatan   = jabatan;
        this.jamLembur = 0;
        setGajiPokok(gajiPokok);
    }

    // Getter
    String getNik()      { return nik; }
    String getNama()     { return nama; }
    String getJabatan()  { return jabatan; }
    double getGajiPokok(){ return gajiPokok; }
    int    getJamLembur(){ return jamLembur; }

    // Setter dengan validasi
    void setGajiPokok(double gaji) {
        if (gaji >= GAJI_MINIMUM) this.gajiPokok = gaji;
        else System.out.printf("  ⚠ Gaji %.0f di bawah minimum Rp%.0f!%n", gaji, GAJI_MINIMUM);
    }

    void setJabatan(String jabatan) {
        if (jabatan != null && !jabatan.isEmpty()) this.jabatan = jabatan;
    }

    void tambahLembur(int jam) {
        if (jam > 0) {
            jamLembur += jam;
            System.out.println("  " + nama + " lembur +" + jam + " jam (total: " + jamLembur + " jam)");
        }
    }

    // Business logic: hitung total gaji
    double hitungGaji() { return gajiPokok + (jamLembur * TARIF_LEMBUR); }
    double hitungBonus() { return gajiPokok * TARIF_BONUS; }

    void cetakSlipGaji() {
        System.out.println("  ┌── Slip Gaji ──────────────────────────────┐");
        System.out.printf ("  │ NIK      : %-30s│%n", nik);
        System.out.printf ("  │ Nama     : %-30s│%n", nama);
        System.out.printf ("  │ Jabatan  : %-30s│%n", jabatan);
        System.out.printf ("  │ Gaji Pokok  : Rp%,10.0f             │%n", gajiPokok);
        System.out.printf ("  │ Tunjangan LB: Rp%,10.0f             │%n", jamLembur * TARIF_LEMBUR);
        System.out.printf ("  │ Bonus (10%%) : Rp%,10.0f             │%n", hitungBonus());
        System.out.println("  │" + "─".repeat(44) + "│");
        System.out.printf ("  │ TOTAL GAJI  : Rp%,10.0f             │%n", hitungGaji() + hitungBonus());
        System.out.println("  └───────────────────────────────────────────┘");
    }
}
