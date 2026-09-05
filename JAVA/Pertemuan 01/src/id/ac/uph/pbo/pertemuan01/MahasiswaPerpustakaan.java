package id.ac.uph.pbo.pertemuan01;

public class MahasiswaPerpustakaan {

    private String nama;
    private String nim;
    private int    totalPinjaman;   // jumlah buku yang dipinjam
    private double dendaAktif;      // dalam rupiah

    public MahasiswaPerpustakaan(String nama, String nim) {
        this.nama          = nama;
        this.nim           = nim;
        this.totalPinjaman = 0;
        this.dendaAktif    = 0.0;
    }

    public void pinjamBuku(String judulBuku) {
        totalPinjaman++;
        System.out.println(nama + " meminjam buku: \"" + judulBuku + "\""
                + " (total pinjaman: " + totalPinjaman + ")");
    }

    public void kembalikanBuku(boolean terlambat) {
        if (totalPinjaman > 0) {
            totalPinjaman--;
            if (terlambat) {
                dendaAktif += 2000;
                System.out.println(nama + " mengembalikan buku (TERLAMBAT) – "
                        + "denda bertambah Rp2.000 → total denda: Rp" + (int)dendaAktif);
            } else {
                System.out.println(nama + " mengembalikan buku tepat waktu. ✓");
            }
        } else {
            System.out.println(nama + " tidak memiliki pinjaman aktif.");
        }
    }

    public void tampilkanInfo() {
        System.out.println("  ┌─ Kartu Perpustakaan ──────────────────────┐");
        System.out.println("  │ Nama          : " + nama);
        System.out.println("  │ NIM           : " + nim);
        System.out.println("  │ Buku dipinjam : " + totalPinjaman);
        System.out.printf ("  │ Denda aktif   : Rp%.0f%n", dendaAktif);
        System.out.println("  └───────────────────────────────────────────┘");
    }
}
