package id.ac.uph.pbo.pertemuan01;

public class MobilWarisan extends Kendaraan {
    private int jumlahPintu;

    public MobilWarisan(String merek, int jumlahPintu) {
        super(merek);   // memanggil constructor Kendaraan
        this.jumlahPintu = jumlahPintu;
    }

    // Method tambahan khusus Mobil
    public void bukaKap() {
        System.out.println("[Mobil:" + merek + "] Membuka kap mesin.");
    }
}
