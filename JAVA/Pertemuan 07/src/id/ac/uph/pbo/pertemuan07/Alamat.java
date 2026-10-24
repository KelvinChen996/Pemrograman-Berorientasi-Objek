package id.ac.uph.pbo.pertemuan07;

public class Alamat {
    String jalan, kota, provinsi, kodePos;

    Alamat(String jalan, String kota, String provinsi, String kodePos) {
        this.jalan    = jalan;
        this.kota     = kota;
        this.provinsi = provinsi;
        this.kodePos  = kodePos;
    }

    String format() {
        return jalan + ", " + kota + ", " + provinsi + " " + kodePos;
    }
}
