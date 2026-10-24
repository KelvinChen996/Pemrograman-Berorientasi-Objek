package id.ac.uph.pbo.pertemuan09;

public class MotorBase extends KendaraanBase {
    private int silinder;

    MotorBase(String merek, String model, int tahun, double harga, int silinder) {
        super(merek, model, tahun, harga);
        this.silinder = silinder;
    }

    @Override String getJenis() { return "Motor"; }

    @Override
    void nyalakan() {
        System.out.println("  " + merek + " " + model + " – Kick start! Vroom!");
    }
}
