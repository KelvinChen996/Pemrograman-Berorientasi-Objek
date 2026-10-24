package id.ac.uph.pbo.pertemuan09;

public class KendaraanListrik extends KendaraanBase {
    protected double kapasitasBaterai; // kWh
    protected double bateraiPersen;

    KendaraanListrik(String merek, String model, int tahun, double harga, double kWh) {
        super(merek, model, tahun, harga);
        this.kapasitasBaterai = kWh;
        this.bateraiPersen    = 100;
    }

    @Override String getJenis()       { return "Kendaraan Listrik"; }
    @Override String getBahanBakar()  { return "Listrik (" + kapasitasBaterai + " kWh)"; }

    @Override
    void nyalakan() {
        System.out.println("  " + merek + " – Senyap... (electric motor on) ⚡");
    }

    void cas(double jam) {
        bateraiPersen = Math.min(100, bateraiPersen + (jam * 20));
        System.out.printf("  %s – Setelah %.0f jam cas: %.0f%%%n", merek, jam, bateraiPersen);
    }
}
