package id.ac.uph.pbo.pertemuan14;

public class Rekening {
    private String pemilik;
    private double saldo;

    Rekening(String pemilik, double saldo) {
        this.pemilik = pemilik;
        this.saldo   = saldo;
    }

    void tarik(double jumlah) {
        if (jumlah <= 0) throw new IllegalArgumentException("Jumlah tarik harus > 0");
        if (jumlah > saldo) throw new SaldoTidakCukupException(saldo, jumlah);
        saldo -= jumlah;
        System.out.printf("  ✓ [%s] Tarik Rp%,.0f | Sisa: Rp%,.0f%n", pemilik, jumlah, saldo);
    }

    double getSaldo() { return saldo; }
}
