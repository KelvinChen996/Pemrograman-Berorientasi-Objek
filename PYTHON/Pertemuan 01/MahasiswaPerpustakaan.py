import sys
sys.stdout.reconfigure(encoding='utf-8')
class MahasiswaPerpustakaan:
    def __init__(self, nama: str, nim: str):
        self.nama = nama
        self.nim = nim
        self.total_pinjaman = 0
        self.denda_aktif = 0.0

    def pinjam_buku(self, judul_buku: str):
        self.total_pinjaman += 1
        print(f"{self.nama} meminjam buku: \"{judul_buku}\" (total pinjaman: {self.total_pinjaman})")

    def kembalikan_buku(self, terlambat: bool):
        if self.total_pinjaman > 0:
            self.total_pinjaman -= 1
            if terlambat:
                self.denda_aktif += 2000
                print(f"{self.nama} mengembalikan buku (TERLAMBAT) – denda bertambah Rp2.000 → total denda: Rp{int(self.denda_aktif)}")
            else:
                print(f"{self.nama} mengembalikan buku tepat waktu. ✓")
        else:
            print(f"{self.nama} tidak memiliki pinjaman aktif.")

    def tampilkan_info(self):
        print("  ┌─ Kartu Perpustakaan ──────────────────────┐")
        print(f"  │ Nama          : {self.nama}")
        print(f"  │ NIM           : {self.nim}")
        print(f"  │ Buku dipinjam : {self.total_pinjaman}")
        print(f"  │ Denda aktif   : Rp{self.denda_aktif:.0f}")
        print("  └───────────────────────────────────────────┘")

