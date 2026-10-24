package id.ac.uph.pbo.pertemuan07;

public class BayarDompetDigital implements Bayar {
    private String akun;
    private double saldo;
    BayarDompetDigital(String akun, double saldo) { this.akun = akun; this.saldo = saldo; }

    @Override
    public boolean prosesPembayaran(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.printf("  [%s] Bayar Rp%,.0f → Sisa saldo: Rp%,.0f%n", akun, jumlah, saldo);
            return true;
        }
        System.out.println("  [" + akun + "] Saldo tidak cukup!");
        return false;
    }
    @Override public String getMetodePembayaran() { return "Dompet Digital (" + akun + ")"; }
}
