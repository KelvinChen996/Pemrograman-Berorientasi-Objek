package id.ac.uph.pbo.pertemuan01;

public class Motor extends Kendaraan {
    public Motor(String merek) { super(merek); }

    @Override
    public void jalan() {
        kecepatan = 90;
        System.out.println("[Motor:" + merek + "] Ngebut " + kecepatan + " km/j!");
    }
}
