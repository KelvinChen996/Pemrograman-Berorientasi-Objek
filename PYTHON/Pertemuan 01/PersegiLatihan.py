import sys
sys.stdout.reconfigure(encoding='utf-8')
class PersegiLatihan:
    def __init__(self, sisi: float):
        self.sisi = sisi

    def hitung_luas(self) -> float:
        return self.sisi * self.sisi

    def hitung_keliling(self) -> float:
        return 4 * self.sisi

    def cetak(self):
        print(f"  Persegi (sisi={self.sisi:.1f}): Luas={self.hitung_luas():.2f}, Keliling={self.hitung_keliling():.2f}")

