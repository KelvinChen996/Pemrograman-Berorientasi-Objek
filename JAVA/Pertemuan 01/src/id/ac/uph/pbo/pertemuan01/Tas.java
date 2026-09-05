package id.ac.uph.pbo.pertemuan01;

public class Tas {
    private String merek;
    private String warna;
    private double kapasitasLiter;
    private int    jumlahKantong;
    private boolean terkunci;

    public Tas(String merek, String warna, double kapasitasLiter, int jumlahKantong) {
        this.merek          = merek;
        this.warna          = warna;
        this.kapasitasLiter = kapasitasLiter;
        this.jumlahKantong  = jumlahKantong;
        this.terkunci       = false;
    }

    public void masukkanBarang(String barang) {
        System.out.println("[Tas " + merek + "] Memasukkan: " + barang);
    }

    public void keluarkanBarang(String barang) {
        System.out.println("[Tas " + merek + "] Mengeluarkan: " + barang);
    }

    public void kunci() {
        terkunci = true;
        System.out.println("[Tas " + merek + "] Terkunci 🔒");
    }

    public void tampilkanInfo() {
        System.out.println("  Tas       : " + merek + " (" + warna + ")");
        System.out.println("  Kapasitas : " + kapasitasLiter + " Liter");
        System.out.println("  Kantong   : " + jumlahKantong);
        System.out.println("  Terkunci  : " + (terkunci ? "Ya" : "Tidak"));
    }
}
