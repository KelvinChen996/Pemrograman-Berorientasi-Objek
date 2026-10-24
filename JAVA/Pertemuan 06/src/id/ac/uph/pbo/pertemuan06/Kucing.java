package id.ac.uph.pbo.pertemuan06;

public class Kucing extends Hewan {
    private boolean peliharaan;

Kucing(String nama, boolean peliharaan) {
        super(nama, "Kucing");
        this.peliharaan = peliharaan;
    }

    @Override
    void bersuara() {
        System.out.println("  [Kucing] " + nama + ": Meong~ Meong~ 🐈");
    }

    @Override
    void makan() {
        super.makan();
        System.out.println("    (" + nama + " makan dengan sopan menggunakan piring)");
    }
}

