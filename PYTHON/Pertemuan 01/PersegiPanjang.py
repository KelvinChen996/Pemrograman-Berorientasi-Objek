import sys
sys.stdout.reconfigure(encoding='utf-8')
class PersegiPanjang:
    def __init__(self, panjang: float, lebar: float):
        self.panjang = panjang
        self.lebar = lebar

    def hitung_luas(self) -> float:
        return self.panjang * self.lebar

    def hitung_keliling(self) -> float:
        return 2 * (self.panjang + self.lebar)

    def cetak(self):
        print(f"  PersegiPanjang ({self.panjang:.1f}x{self.lebar:.1f}): Luas={self.hitung_luas():.2f}, Keliling={self.hitung_keliling():.2f}")

