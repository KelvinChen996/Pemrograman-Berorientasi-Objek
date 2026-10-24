package id.ac.uph.pbo.pertemuan06;

public class Hewan {
    protected String nama;
    protected String jenisHewan;

    Hewan(String nama, String jenisHewan) {
        this.nama      = nama;
        this.jenisHewan = jenisHewan;
    }

    // Method ini akan di-override oleh subclass
    void bersuara() {
        System.out.println("  [" + jenisHewan + "] " + nama + " mengeluarkan suara...");
    }

    void makan() {
        System.out.println("  [" + jenisHewan + "] " + nama + " sedang makan.");
    }

    void info() {
        System.out.println("  Hewan: " + nama + " (" + jenisHewan + ")");
    }
}
