package id.ac.uph.pbo.pertemuan06;

public class Anjing extends Hewan {
    private String ras;

    Anjing(String nama, String ras) {
        super(nama, "Anjing");   // panggil constructor superclass
        this.ras = ras;
    }

    @Override   // anotasi: wajib ada agar IDE menangkap salah ketik
    void bersuara() {
        System.out.println("  [Anjing/" + ras + "] " + nama + ": Guk Guk Guk! 🐕");
    }

    @Override
    void info() {
        super.info();   // panggil method parent
        System.out.println("  Ras: " + ras);
    }

    void ajakJalan() {
        System.out.println("  " + nama + " senang diajak jalan! 🦮");
    }
}
