package id.ac.uph.pbo.pertemuan02;

public class Mahasiswa {
    // Atribut: camelCase, private (sesuai standar)
    private String nama;
    private int    umur;
    private double ipk;

    // Konstanta: UPPER_SNAKE_CASE
    static final double IPK_MINIMUM_LULUS = 2.00;

    // Konstruktor
    Mahasiswa(String nama, int umur, double ipk) {
        this.nama = nama;
        this.umur = umur;
        this.ipk  = ipk;
    }

    // Method: camelCase
    String getNama()   { return nama; }
    double getIpk()    { return ipk; }
    boolean apakahLulus() { return ipk >= IPK_MINIMUM_LULUS; }

    void tampilkan() {
        System.out.printf("  Nama: %-15s | Umur: %2d | IPK: %.2f | Lulus: %s%n",
                nama, umur, ipk, apakahLulus() ? "Ya" : "Tidak");
    }
}
