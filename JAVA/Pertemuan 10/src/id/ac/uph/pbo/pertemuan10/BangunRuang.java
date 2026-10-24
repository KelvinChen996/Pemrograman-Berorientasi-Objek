package id.ac.uph.pbo.pertemuan10;

public abstract class BangunRuang {
    protected String nama;

    BangunRuang(String nama) { this.nama = nama; }

    // Abstract method – WAJIB di-override oleh subclass
    abstract double hitungVolume();
    abstract double hitungLuasPermukaan();

    // Concrete method – tersedia untuk semua subclass
    void tampilkanHasil() {
        System.out.printf("  [%-15s] Volume: %10.2f | Luas Permukaan: %10.2f%n",
                nama, hitungVolume(), hitungLuasPermukaan());
    }

    String getNama() { return nama; }
}
