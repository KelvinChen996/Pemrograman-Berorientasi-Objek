package id.ac.uph.pbo.pertemuan09;

public class KendaraanBase {
    protected String merek;
    protected String model;
    protected int    tahunProduksi;
    protected double harga;

    KendaraanBase(String merek, String model, int tahun, double harga) {
        this.merek         = merek;
        this.model         = model;
        this.tahunProduksi = tahun;
        this.harga         = harga;
    }

    // Method yang bisa di-override
    String getJenis()  { return "Kendaraan"; }
    String getBahanBakar() { return "Bensin"; }

    void nyalakan()  { System.out.println("  " + merek + " " + model + " dinyalakan."); }
    void matikan()   { System.out.println("  " + merek + " " + model + " dimatikan."); }

    void info() {
        System.out.printf("  [%s] %s %s (%d) – Rp%,.0f | BB: %s%n",
                getJenis(), merek, model, tahunProduksi, harga, getBahanBakar());
    }
}
