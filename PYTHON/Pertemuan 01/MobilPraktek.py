import sys
sys.stdout.reconfigure(encoding='utf-8')
class MobilPraktek:
    def __init__(self, merek: str, warna: str):
        self.merek = merek
        self.warna = warna
        self.kecepatan = 0

    def jalan(self):
        self.kecepatan = 60
        print(f"{self.merek} melaju {self.kecepatan} km/j")

    def berhenti(self):
        self.kecepatan = 0
        print(f"{self.merek} berhenti")

    def klakson(self):
        print(f"{self.merek}: Beep Beep!")

    def info(self):
        print(f"  Merek     : {self.merek}")
        print(f"  Warna     : {self.warna}")
        print(f"  Kecepatan : {self.kecepatan} km/j")

