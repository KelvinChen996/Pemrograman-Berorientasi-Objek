package id.ac.uph.pbo.pertemuan07;

public class OrderItem {
    private String namaProduk;
    private int    jumlah;
    private double hargaSatuan;

    OrderItem(String namaProduk, int jumlah, double hargaSatuan) {
        this.namaProduk  = namaProduk;
        this.jumlah      = jumlah;
        this.hargaSatuan = hargaSatuan;
    }

    double subtotal() { return jumlah * hargaSatuan; }

    void tampilkan() {
        System.out.printf("    %-20s x%2d @ Rp%,8.0f = Rp%,10.0f%n",
                namaProduk, jumlah, hargaSatuan, subtotal());
    }
}
