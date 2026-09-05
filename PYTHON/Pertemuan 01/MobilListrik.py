import sys
sys.stdout.reconfigure(encoding='utf-8')
from MobilWarisan import MobilWarisan

class MobilListrik(MobilWarisan):
    def __init__(self, merek: str, baterai_awal: float):
        super().__init__(merek, 4)
        self.baterai_persen = baterai_awal

    def cas(self):
        self.baterai_persen = 100.0
        print(f"[MobilListrik:{self.merek}] Baterai penuh: 100%")

    def jalan(self):
        if self.baterai_persen > 0:
            self.kecepatan = 80
            self.baterai_persen -= 10
            print(f"[MobilListrik:{self.merek}] Melaju {self.kecepatan} km/j | Baterai: {self.baterai_persen}%")
        else:
            print(f"[MobilListrik:{self.merek}] Baterai habis! Perlu di-charge.")

