package id.ac.uph.pbo.pertemuan07;

public class Order {
    private String      orderId;
    private Pelanggan   pelanggan;   // Association
    private OrderItem[] items;       // Composition (items hidup di dalam Order)
    private int         jumlahItems;

    Order(String orderId, Pelanggan pelanggan, int maxItems) {
        this.orderId   = orderId;
        this.pelanggan = pelanggan;
        this.items     = new OrderItem[maxItems];
        this.jumlahItems = 0;
    }

    void tambahItem(String nama, int qty, double harga) {
        if (jumlahItems < items.length) {
            items[jumlahItems++] = new OrderItem(nama, qty, harga);
        }
    }

    double totalHarga() {
        double total = 0;
        for (int i = 0; i < jumlahItems; i++) total += items[i].subtotal();
        return total;
    }

    // Dependency: Order MENGGUNAKAN Printer sementara saat cetak struk
    void cetakStruk(Printer printer) {
        StringBuilder sb = new StringBuilder();
        sb.append("Order: ").append(orderId).append("\n");
        sb.append("  │ Pelanggan: ").append(pelanggan.getNama()).append("\n");
        for (int i = 0; i < jumlahItems; i++) {
            items[i].tampilkan();
        }
        sb.append(String.format("  │ TOTAL: Rp%,.0f", totalHarga()));
        printer.cetakStruk(sb.toString());
    }

    // Dependency: Order MENGGUNAKAN Notifikasi untuk kirim konfirmasi
    void konfirmasi(Notifikasi notif) {
        notif.kirimNotifikasi("Order " + orderId + " senilai Rp" +
                String.format("%,.0f", totalHarga()) + " dikonfirmasi!");
    }
}
