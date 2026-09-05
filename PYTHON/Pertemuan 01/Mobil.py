import sys
sys.stdout.reconfigure(encoding='utf-8')
class Mobil:
    def __init__(self, merek: str, warna: str, bahan_bakar_awal: float):
        self.merek = merek
        self.warna = warna
        self.kecepatan = 0
        self.jumlah_bahan_bakar = bahan_bakar_awal

    def jalan(self):
        if self.jumlah_bahan_bakar > 0:
            self.kecepatan = 60
            self.jumlah_bahan_bakar -= 5
            print(f"[{self.merek}] melaju {self.kecepatan} km/j | BBM tersisa: {self.jumlah_bahan_bakar} L")
        else:
            print(f"[{self.merek}] tidak bisa jalan – BBM habis!")

    def berhenti(self):
        self.kecepatan = 0
        print(f"[{self.merek}] berhenti.")

    def klakson(self):
        print(f"[{self.merek}] BEEP BEEP! 📯")

    def isi_bahan_bakar(self, liter: float):
        self.jumlah_bahan_bakar += liter
        print(f"[{self.merek}] diisi BBM +{liter} L → total: {self.jumlah_bahan_bakar} L")

    def tampilkan_state(self):
        print(f"  Merek     : {self.merek}")
        print(f"  Warna     : {self.warna}")
        print(f"  Kecepatan : {self.kecepatan} km/j")
        print(f"  BBM       : {self.jumlah_bahan_bakar} L")

