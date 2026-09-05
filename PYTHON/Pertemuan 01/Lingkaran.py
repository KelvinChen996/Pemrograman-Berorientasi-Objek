import sys
sys.stdout.reconfigure(encoding='utf-8')
import math
from BangunDatar import BangunDatar

class Lingkaran(BangunDatar):
    def __init__(self, radius: float):
        super().__init__("Lingkaran")
        self.radius = radius

    def hitung_luas(self) -> float:
        return math.pi * self.radius * self.radius

    def hitung_keliling(self) -> float:
        return 2 * math.pi * self.radius

