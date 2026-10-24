package id.ac.uph.pbo.pertemuan09;

public final class MobilListrikTesla extends KendaraanListrik {
    private boolean autopilot;

    MobilListrikTesla(String model, int tahun, double harga) {
        super("Tesla", model, tahun, harga, 100);
        this.autopilot = true;
    }

    @Override String getJenis() { return "Mobil Listrik (Tesla)"; }

    void aktifkanAutopilot() {
        System.out.println("  Tesla " + model + " – Autopilot ON 🤖");
    }
}
