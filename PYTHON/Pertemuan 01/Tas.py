import sys
sys.stdout.reconfigure(encoding='utf-8')
class Tas:
    def __init__(self, merek: str, warna: str, kapasitas_liter: float, jumlah_kantong: int):
        self.merek = merek
        self.warna = warna
        self.kapasitas_liter = kapasitas_liter
        self.jumlah_kantong = jumlah_kantong
        self.terkunci = False

    def masukkan_barang(self, barang: str):
        print(f"[Tas {self.merek}] Memasukkan: {barang}")

    def keluarkan_barang(self, barang: str):
        print(f"[Tas {self.merek}] Mengeluarkan: {barang}")

    def kunci(self):
        self.terkunci = True
        print(f"[Tas {self.merek}] Terkunci 🔒")

    def tampilkan_info(self):
        print(f"  Tas       : {self.merek} ({self.warna})")
        print(f"  Kapasitas : {self.kapasitas_liter} Liter")
        print(f"  Kantong   : {self.jumlah_kantong}")
        print(f"  Terkunci  : {'Ya' if self.terkunci else 'Tidak'}")

