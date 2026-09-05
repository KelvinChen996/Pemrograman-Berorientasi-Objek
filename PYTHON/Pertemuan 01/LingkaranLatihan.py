import sys
sys.stdout.reconfigure(encoding='utf-8')
import math

class LingkaranLatihan:
    def __init__(self, radius: float):
        self.radius = radius

    def hitung_luas(self) -> float:
        return math.pi * self.radius * self.radius

    def hitung_keliling(self) -> float:
        return 2 * math.pi * self.radius

    def cetak(self):
        print(f"  Lingkaran (r={self.radius:.1f}): Luas={self.hitung_luas():.2f}, Keliling={self.hitung_keliling():.2f}")

