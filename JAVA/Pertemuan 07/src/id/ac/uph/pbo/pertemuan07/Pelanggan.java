package id.ac.uph.pbo.pertemuan07;

public class Pelanggan {
    private String  id;
    private String  nama;
    private Alamat  alamat;   // Association HAS-A Alamat

    Pelanggan(String id, String nama, Alamat alamat) {
        this.id     = id;
        this.nama   = nama;
        this.alamat = alamat;
    }

    String getId()   { return id; }
    String getNama() { return nama; }
    Alamat getAlamat() { return alamat; }

    void info() {
        System.out.println("  Pelanggan : " + nama + " (" + id + ")");
        System.out.println("  Alamat    : " + alamat.format());
    }
}
