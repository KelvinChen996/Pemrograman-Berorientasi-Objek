package id.ac.uph.pbo.pertemuan01;

public abstract class BangunDatar {
    protected String nama;

    public BangunDatar(String nama) { this.nama = nama; }

    // Method abstrak – wajib diimplementasikan oleh subclass
    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    // Method konkret – tersedia untuk semua subclass
    public void tampilkanHasil() {
        System.out.printf("  [%s] Luas = %.2f | Keliling = %.2f%n",
                nama, hitungLuas(), hitungKeliling());
    }
}
