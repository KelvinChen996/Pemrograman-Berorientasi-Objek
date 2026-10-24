package id.ac.uph.pbo.pertemuan10;

public interface Payable {
    boolean bayar(double jumlah);
    void refund(double jumlah);
    String getInfo();
}
