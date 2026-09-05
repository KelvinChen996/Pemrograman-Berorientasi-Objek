package id.ac.uph.pbo.pertemuan01;

public class Ponsel {
    private String merek;
    private String model;
    private double ukuranLayar;   // inch
    private int    kapasitasBaterai; // mAh
    private int    bateraiPersen;

    public Ponsel(String merek, String model, double ukuranLayar, int kapasitasBaterai) {
        this.merek            = merek;
        this.model            = model;
        this.ukuranLayar      = ukuranLayar;
        this.kapasitasBaterai = kapasitasBaterai;
        this.bateraiPersen    = 100;
    }

    public void telepon(String nomor) {
        System.out.println("[" + merek + " " + model + "] Menelepon: " + nomor);
    }

    public void ambilFoto() {
        System.out.println("[" + merek + " " + model + "] Foto diambil 📸");
    }

    public void cas() {
        bateraiPersen = 100;
        System.out.println("[" + merek + " " + model + "] Baterai penuh: 100%");
    }

    public void tampilkanInfo() {
        System.out.println("  Ponsel    : " + merek + " " + model);
        System.out.println("  Layar     : " + ukuranLayar + " inch");
        System.out.println("  Baterai   : " + kapasitasBaterai + " mAh (" + bateraiPersen + "%)");
    }
}
