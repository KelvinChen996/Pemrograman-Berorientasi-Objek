import sys
sys.stdout.reconfigure(encoding='utf-8')
from Kendaraan import Kendaraan

class Motor(Kendaraan):
    def __init__(self, merek: str):
        super().__init__(merek)

    def jalan(self):
        self.kecepatan = 90
        print(f"[Motor:{self.merek}] Ngebut {self.kecepatan} km/j!")

