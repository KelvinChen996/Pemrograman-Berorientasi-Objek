import sys
sys.stdout.reconfigure(encoding='utf-8')
import math
from BangunDatar import BangunDatar

class SegitigaSiku(BangunDatar):
    def __init__(self, alas: float, tinggi: float):
        super().__init__("Segitiga Siku-Siku")
        self.alas = alas
        self.tinggi = tinggi
        self.sisi_miring = math.sqrt(alas * alas + tinggi * tinggi)

    def hitung_luas(self) -> float:
        return 0.5 * self.alas * self.tinggi

    def hitung_keliling(self) -> float:
        return self.alas + self.tinggi + self.sisi_miring

