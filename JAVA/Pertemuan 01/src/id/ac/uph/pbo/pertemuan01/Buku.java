package id.ac.uph.pbo.pertemuan01;

public class Buku {

    private String judul;
    private String penulis;
    private int    jumlahHalaman;

    public Buku(String judul, String penulis, int jumlahHalaman) {
        this.judul         = judul;
        this.penulis       = penulis;
        this.jumlahHalaman = jumlahHalaman;
    }

    // Method yang diminta slide
    public void tampilkanInfo() {
        System.out.println("  ┌─────────────────────────────────────────┐");
        System.out.println("  │ Judul   : " + judul);
        System.out.println("  │ Penulis : " + penulis);
        System.out.println("  │ Halaman : " + jumlahHalaman);
        System.out.println("  └─────────────────────────────────────────┘");
    }
}
