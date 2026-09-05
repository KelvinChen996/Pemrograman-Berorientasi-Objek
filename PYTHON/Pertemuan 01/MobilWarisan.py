import sys
sys.stdout.reconfigure(encoding='utf-8')
from Kendaraan import Kendaraan

class MobilWarisan(Kendaraan):
    def __init__(self, merek: str, jumlah_pintu: int):
        super().__init__(merek)
        self.jumlah_pintu = jumlah_pintu

    def buka_kap(self):
        print(f"[Mobil:{self.merek}] Membuka kap mesin.")

