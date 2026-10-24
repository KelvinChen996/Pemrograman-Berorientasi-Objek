package id.ac.uph.pbo.pertemuan10;

public class GopayWallet extends BasePayment {
    private String noHP;

    GopayWallet(String pemilik, String noHP, double saldo) {
        super("GOPAY-" + noHP.substring(noHP.length()-4), pemilik, saldo);
        this.noHP = noHP;
    }

    @Override
    public boolean bayar(double jumlah) {
        if (cekSaldo(jumlah)) {
            saldo -= jumlah;
            System.out.printf("  [GoPay %s] Bayar Rp%,.0f ✓ (sisa: Rp%,.0f)%n",
                    noHP, jumlah, saldo);
            return true;
        }
        System.out.println("  [GoPay] Saldo GoPay tidak cukup! Top-up dulu.");
        return false;
    }

    @Override public String getInfo() {
        return String.format("GoPay [%s] Pemilik: %s Saldo: Rp%,.0f", noHP, pemilik, saldo);
    }
}
