import sys
sys.stdout.reconfigure(encoding='utf-8')
from MahasiswaAkademik import MahasiswaAkademik
from MahasiswaPerpustakaan import MahasiswaPerpustakaan

def main():
    print("╔══════════════════════════════════════════════╗")
    print("║   PROSES ABSTRAKSI – Satu Objek, Dua Konteks ║")
    print("╚══════════════════════════════════════════════╝\n")

    print("Orang yang sama di dunia nyata: 'Sari Wulandari'")
    print("Diabstraksikan BERBEDA sesuai konteks sistem:\n")

    # ── Konteks 1: Sistem Akademik ───────────────────────────────────────
    print("── KONTEKS 1: Sistem Akademik ──")
    sari_akademik = MahasiswaAkademik("Sari Wulandari", "220301002", 3.75, 3, "Sistem Informasi")
    sari_akademik.tampilkan_info()
    sari_akademik.ambil_mata_kuliah("Pemrograman Berorientasi Objek")
    sari_akademik.hitung_ipk([3.5, 4.0, 3.75, 3.8])

    # ── Konteks 2: Sistem Perpustakaan ───────────────────────────────────
    print("\n── KONTEKS 2: Sistem Perpustakaan ──")
    sari_pustaka = MahasiswaPerpustakaan("Sari Wulandari", "220301002")
    sari_pustaka.pinjam_buku("Object-Oriented Software Construction")
    sari_pustaka.pinjam_buku("Head First Java")
    sari_pustaka.kembalikan_buku(False)   # tepat waktu
    sari_pustaka.kembalikan_buku(True)    # terlambat
    sari_pustaka.tampilkan_info()

    print("\n──────────────────────────────────────────────────")
    print("KESIMPULAN: Abstraksi = pilih atribut yang RELEVAN")
    print("           sesuai kebutuhan sistem. Detail yang tidak")
    print("           relevan (warna baju, hobi) → DIABAIKAN.")
    print("──────────────────────────────────────────────────")

if __name__ == "__main__":
    main()

