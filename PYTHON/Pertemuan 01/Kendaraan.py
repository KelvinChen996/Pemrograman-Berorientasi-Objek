import sys
sys.stdout.reconfigure(encoding='utf-8')
class Kendaraan:
    def __init__(self, merek: str):
        self.merek = merek
        self.kecepatan = 0

    def jalan(self):
        self.kecepatan = 60
        print(f"[Kendaraan:{self.merek}] Melaju {self.kecepatan} km/j")

    def berhenti(self):
        self.kecepatan = 0
        print(f"[Kendaraan:{self.merek}] Berhenti.")

