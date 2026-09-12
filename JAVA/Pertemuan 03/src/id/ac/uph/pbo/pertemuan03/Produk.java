package id.ac.uph.pbo.pertemuan03;

public class Produk {
    private String nama;
    private double harga;
    private int    stok;

    Produk(String nama, double harga, int stok) {
        this.nama  = nama;
        this.harga = harga;
        this.stok  = stok;
    }

    // Getter
    String getNama()   { return nama; }
    double getHarga()  { return harga; }
    int    getStok()   { return stok; }

    // Business logic
    boolean tersedia()       { return stok > 0; }
    double  totalNilai()     { return harga * stok; }

    void beli(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.printf("  Beli %d unit %s → stok sisa: %d%n", jumlah, nama, stok);
        } else {
            System.out.println("  ⚠ Stok " + nama + " tidak cukup! (stok=" + stok + ")");
        }
    }

    void info() {
        System.out.printf("  %-20s | Rp%,10.0f | Stok: %3d | Tersedia: %s%n",
                nama, harga, stok, tersedia() ? "Ya" : "Tidak");
    }
}
