package id.ac.uph.pbo.pertemuan10;

public abstract class BasePayment implements Payable {
    protected String id;
    protected String pemilik;
    protected double saldo;

    BasePayment(String id, String pemilik, double saldo) {
        this.id      = id;
        this.pemilik = pemilik;
        this.saldo   = saldo;
    }

    // Concrete method yang bisa dipakai semua subclass
    boolean cekSaldo(double jumlah) { return saldo >= jumlah; }
    double  getSaldo()              { return saldo; }

    @Override
    public void refund(double jumlah) {
        saldo += jumlah;
        System.out.printf("  [REFUND] Rp%,.0f dikembalikan ke %s (saldo: Rp%,.0f)%n",
                jumlah, pemilik, saldo);
    }

    // Abstract: setiap jenis pembayaran implementasi sendiri
    @Override public abstract boolean bayar(double jumlah);
    @Override public abstract String  getInfo();
}
