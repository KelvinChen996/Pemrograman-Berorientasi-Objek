package id.ac.uph.pbo.pertemuan05;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String programStudi;
    private int    tahunMasuk;
    private double ipk;

    // Nilai default Java: 0, 0.0, false, null (jika tidak di-set)

    // Konstruktor 1: minimal (hanya nim & nama)
    Mahasiswa(String nim, String nama) {
        this(nim, nama, "Sistem Informasi", 2025, 0.0);
    }

    // Konstruktor 2: dengan program studi
    Mahasiswa(String nim, String nama, String programStudi) {
        this(nim, nama, programStudi, 2025, 0.0);
    }

    // Konstruktor 3: lengkap
    Mahasiswa(String nim, String nama, String programStudi, int tahunMasuk, double ipk) {
        this.nim          = nim;
        this.nama         = nama;
        this.programStudi = programStudi;
        this.tahunMasuk   = tahunMasuk;
        this.ipk          = ipk;
    }

    void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) this.ipk = ipk;
    }

    void tampilkan() {
        System.out.printf("  %-12s | %-20s | %-20s | %d | IPK: %.2f%n",
                nim, nama, programStudi, tahunMasuk, ipk);
    }
}
