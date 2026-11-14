package id.ac.uph.pbo.pertemuan14;

public class SaldoTidakCukupException extends RuntimeException {
    private double saldoAda;
    private double jumlahDiminta;

    SaldoTidakCukupException(double saldo, double diminta) {
        super(String.format("Saldo tidak cukup! Ada: Rp%,.0f | Diminta: Rp%,.0f", saldo, diminta));
        this.saldoAda      = saldo;
        this.jumlahDiminta = diminta;
    }

    double getKekurangan() { return jumlahDiminta - saldoAda; }
}
