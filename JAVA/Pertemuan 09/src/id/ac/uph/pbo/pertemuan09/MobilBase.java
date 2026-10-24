package id.ac.uph.pbo.pertemuan09;

public class MobilBase extends KendaraanBase {
    protected int jumlahPintu;

    MobilBase(String merek, String model, int tahun, double harga, int pintu) {
        super(merek, model, tahun, harga);   // wajib panggil super() pertama
        this.jumlahPintu = pintu;
    }

    @Override String getJenis() { return "Mobil"; }

    void bukaKap()  { System.out.println("  " + merek + " – Kap mesin dibuka."); }
    void klakson()  { System.out.println("  " + merek + " – Beep!"); }
}
