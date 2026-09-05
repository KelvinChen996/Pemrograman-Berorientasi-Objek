import sys
sys.stdout.reconfigure(encoding='utf-8')
from Mahasiswa import Mahasiswa

def main():
    print("╔══════════════════════════════════════════════╗")
    print("║   PENDEKATAN OOP – Solusi dengan Enkapsulasi ║")
    print("╚══════════════════════════════════════════════╝\n")

    # ── Membuat objek dari class Mahasiswa ───────────────────────────────
    mhs1 = Mahasiswa("Budi Santoso",  "220301001", 3.50)
    mhs2 = Mahasiswa("Sari Wulandari","220301002", 3.75)
    mhs3 = Mahasiswa("Andi Pratama",  "220301003", 2.90)

    print("Data Mahasiswa yang baru dibuat:")
    mhs1.tampilkan_info()
    mhs2.tampilkan_info()
    mhs3.tampilkan_info()

    # ── Demonstrasi method perilaku ──────────────────────────────────────
    print()
    mhs1.belajar()
    mhs2.hadir_kuliah("Pemrograman Berorientasi Objek")

    # ── Mencoba mengubah IPK dengan nilai TIDAK VALID ────────────────────
    print("\n── Mencoba mengubah IPK Andi ke -99.0 (tidak valid): ──")
    mhs3.ipk = -99.0           # ditolak oleh validasi setter
    print("  IPK Andi setelah percobaan: ", end="")
    print(f"{mhs3.ipk:.2f} (tidak berubah)")

    # ── Mengubah IPK dengan nilai VALID ─────────────────────────────────
    print("\n── Mengubah IPK Andi ke 3.10 (valid): ──")
    mhs3.ipk = 3.10
    print("  IPK Andi sekarang: ", end="")
    print(f"{mhs3.ipk:.2f}")

    print("\n── Data akhir semua mahasiswa: ──")
    mhs1.tampilkan_info()
    mhs2.tampilkan_info()
    mhs3.tampilkan_info()

    print("\n──────────────────────────────────────────────────")
    print("KESIMPULAN: Enkapsulasi melindungi data IPK lewat")
    print("           setter yang tervalidasi – data aman!")
    print("──────────────────────────────────────────────────")

if __name__ == "__main__":
    main()

