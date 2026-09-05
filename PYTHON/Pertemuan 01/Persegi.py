import sys
sys.stdout.reconfigure(encoding='utf-8')
from BangunDatar import BangunDatar

class Persegi(BangunDatar):
    def __init__(self, sisi: float):
        super().__init__("Persegi")
        self.sisi = sisi

    def hitung_luas(self) -> float:
        return self.sisi * self.sisi

    def hitung_keliling(self) -> float:
        return 4 * self.sisi

