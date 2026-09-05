import sys
sys.stdout.reconfigure(encoding='utf-8')
class SegitigaLatihan:
    def __init__(self, alas: float, tinggi: float, sisi_a: float, sisi_b: float, sisi_c: float):
        self.alas = alas
        self.tinggi = tinggi
        self.sisi_a = sisi_a
        self.sisi_b = sisi_b
        self.sisi_c = sisi_c

    def hitung_luas(self) -> float:
        return 0.5 * self.alas * self.tinggi

    def hitung_keliling(self) -> float:
        return self.sisi_a + self.sisi_b + self.sisi_c

    def cetak(self):
        print(f"  Segitiga (a={self.alas:.1f}, t={self.tinggi:.1f}): Luas={self.hitung_luas():.2f}, Keliling={self.hitung_keliling():.2f}")

