package id.ac.uph.pbo.pertemuan06;

public class Burung extends Hewan {
    private double jangkauanTerbang;   // km

    Burung(String nama, double jangkauan) {
        super(nama, "Burung");
        this.jangkauanTerbang = jangkauan;
    }

    @Override
    void bersuara() {
        System.out.println("  [Burung] " + nama + ": Ciit! Tweet! Tweet! 🐦");
    }

    void terbang() {
        System.out.printf("  %s terbang hingga %.0f km!%n", nama, jangkauanTerbang);
    }
}
