import sys
sys.stdout.reconfigure(encoding='utf-8')
from Rekening import Rekening
from MobilListrik import MobilListrik
from MobilWarisan import MobilWarisan
from Motor import Motor
from Persegi import Persegi
from Lingkaran import Lingkaran
from SegitigaSiku import SegitigaSiku

def main():
    print("╔══════════════════════════════════════════════╗")
    print("║   EMPAT PILAR OOP – Pratinjau Konseptual      ║")
    print("╚══════════════════════════════════════════════╝\n")

    # ─── PILAR 1: ENCAPSULATION ──────────────────────────────────────────
    print("══ PILAR 1: ENCAPSULATION ══")
    print("  Saldo hanya bisa diubah lewat method setor/tarik:\n")
    rek = Rekening("Budi", 1_000_000)
    rek.setor(500_000)
    rek.tarik(200_000)
    rek.tarik(2_000_000)   # → ditolak: saldo tidak cukup

    # ─── PILAR 2: INHERITANCE ────────────────────────────────────────────
    print("\n══ PILAR 2: INHERITANCE ══")
    print("  MobilListrik mewarisi Mobil yang mewarisi Kendaraan:\n")
    tesla = MobilListrik("Tesla", 80.0)
    tesla.jalan()    # override jalan() dari Kendaraan
    tesla.jalan()
    tesla.buka_kap()  # method dari MobilWarisan
    tesla.cas()      # method khusus MobilListrik

    # ─── PILAR 3: POLYMORPHISM ───────────────────────────────────────────
    print("\n══ PILAR 3: POLYMORPHISM ══")
    print("  Tipe referensi Kendaraan, perilaku berbeda per objek:\n")

    # Array bertipe Kendaraan, tapi berisi objek berbeda-beda
    armada = [
        MobilWarisan("Avanza", 4),
        Motor("Yamaha"),
        MobilListrik("BYD", 100.0)
    ]

    for k in armada:
        k.jalan()   # method yang sama, perilaku berbeda → POLYMORPHISM

    # ─── PILAR 4: ABSTRACTION ────────────────────────────────────────────
    print("\n══ PILAR 4: ABSTRACTION ══")
    print("  BangunDatar mendefinisikan kontrak hitungLuas/Keliling:\n")

    bentuk = [
        Persegi(5),
        Lingkaran(7),
        SegitigaSiku(3, 4)
    ]

    for b in bentuk:
        b.tampilkan_hasil()   # setiap class implementasi berbeda

    print("\n──────────────────────────────────────────────────")
    print("KESIMPULAN: Empat Pilar OOP bekerja bersama untuk")
    print("  membuat kode yang aman, fleksibel & mudah dikembangkan.")
    print("──────────────────────────────────────────────────")

if __name__ == "__main__":
    main()

