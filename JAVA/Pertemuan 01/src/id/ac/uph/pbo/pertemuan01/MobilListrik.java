package id.ac.uph.pbo.pertemuan01;

public class MobilListrik extends MobilWarisan {
    private double bateraiPersen;

    public MobilListrik(String merek, double bateraiAwal) {
        super(merek, 4);
        this.bateraiPersen = bateraiAwal;
    }

    public void cas() {
        bateraiPersen = 100.0;
        System.out.println("[MobilListrik:" + merek + "] Baterai penuh: 100%");
    }

    @Override
    public void jalan() {   // Override method dari Kendaraan
        if (bateraiPersen > 0) {
            kecepatan      = 80;
            bateraiPersen -= 10;
            System.out.println("[MobilListrik:" + merek + "] Melaju " + kecepatan
                    + " km/j | Baterai: " + bateraiPersen + "%");
        } else {
            System.out.println("[MobilListrik:" + merek + "] Baterai habis! Perlu di-charge.");
        }
    }
}
