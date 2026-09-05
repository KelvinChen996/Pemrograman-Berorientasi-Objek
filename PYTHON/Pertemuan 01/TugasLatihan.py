import sys
sys.stdout.reconfigure(encoding='utf-8')
import math
from Ponsel import Ponsel
from Tas import Tas
from JamTangan import JamTangan
from Buku import Buku
import ProseduralLuas
from PersegiLatihan import PersegiLatihan
from PersegiPanjang import PersegiPanjang
from SegitigaLatihan import SegitigaLatihan
from LingkaranLatihan import LingkaranLatihan

def main():
    print("╔══════════════════════════════════════════════╗")
    print("║   TUGAS & LATIHAN – Pertemuan 1               ║")
    print("╚══════════════════════════════════════════════╝\n")

    # ─── LATIHAN 01: Identifikasi Objek ──────────────────────────────────
    print("══ LATIHAN 01: Identifikasi Objek (Mudah) ══\n")

    hp = Ponsel("Samsung", "Galaxy A55", 6.6, 5000)
    hp.tampilkan_info()
    hp.telepon("08123456789")
    hp.ambil_foto()
    print()

    ransel = Tas("Eiger", "Hitam", 25.0, 5)
    ransel.tampilkan_info()
    ransel.masukkan_barang("Laptop")
    ransel.masukkan_barang("Buku OOP")
    ransel.kunci()
    print()

    jam = JamTangan("Casio", "G-Shock", True)
    jam.tampilkan_info()
    jam.set_waktu(8, 30)
    jam.tampilkan_waktu()
    jam.aktifkan_alarm(6, 0)

    # ─── LATIHAN 02: Class Buku ───────────────────────────────────────────
    print("\n══ LATIHAN 02: Class Buku – 3 Objek (Sedang) ══\n")

    buku1 = Buku("Object-Oriented Software Construction", "Bertrand Meyer", 1254)
    buku2 = Buku("Head First Java", "Kathy Sierra & Bert Bates", 722)
    buku3 = Buku("Clean Code", "Robert C. Martin", 431)

    buku1.tampilkan_info()
    buku2.tampilkan_info()
    buku3.tampilkan_info()

    # ─── LATIHAN 03: Refactor Prosedural → OOP ────────────────────────────
    print("\n══ LATIHAN 03: Refactor Prosedural → OOP (Menantang) ══\n")

    print("  VERSI PROSEDURAL (sebelum refactor):")
    print(f"    Persegi (5)          : Luas = {ProseduralLuas.luas_persegi(5):.2f}")
    print(f"    PersegiPanjang (8x4) : Luas = {ProseduralLuas.luas_persegi_panjang(8, 4):.2f}")
    print(f"    Segitiga (6, 3)      : Luas = {ProseduralLuas.luas_segitiga(6, 3):.2f}")
    print(f"    Lingkaran (7)        : Luas = {ProseduralLuas.luas_lingkaran(7):.2f}")

    print("\n  VERSI OOP (setelah refactor):")
    PersegiLatihan(5).cetak()
    PersegiPanjang(8, 4).cetak()
    SegitigaLatihan(6, 3, 6, 3, math.sqrt(45)).cetak()
    LingkaranLatihan(7).cetak()

    print("\n──────────────────────────────────────────────────")
    print("Versi OOP lebih terstruktur: setiap bangun datar")
    print("adalah objek yang tahu cara menghitung dirinya sendiri.")
    print("──────────────────────────────────────────────────")

if __name__ == "__main__":
    main()

