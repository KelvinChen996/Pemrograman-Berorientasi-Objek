import sys
sys.stdout.reconfigure(encoding='utf-8')
class Buku:
    def __init__(self, judul: str, penulis: str, jumlah_halaman: int):
        self.judul = judul
        self.penulis = penulis
        self.jumlah_halaman = jumlah_halaman

    # Method yang diminta slide
    def tampilkan_info(self):
        print("  ┌─────────────────────────────────────────┐")
        print(f"  │ Judul   : {self.judul}")
        print(f"  │ Penulis : {self.penulis}")
        print(f"  │ Halaman : {self.jumlah_halaman}")
        print("  └─────────────────────────────────────────┘")

