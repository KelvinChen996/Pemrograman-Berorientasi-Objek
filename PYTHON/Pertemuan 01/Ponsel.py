import sys
sys.stdout.reconfigure(encoding='utf-8')
class Ponsel:
    def __init__(self, merek: str, model: str, ukuran_layar: float, kapasitas_baterai: int):
        self.merek = merek
        self.model = model
        self.ukuran_layar = ukuran_layar
        self.kapasitas_baterai = kapasitas_baterai
        self.baterai_persen = 100

    def telepon(self, nomor: str):
        print(f"[{self.merek} {self.model}] Menelepon: {nomor}")

    def ambil_foto(self):
        print(f"[{self.merek} {self.model}] Foto diambil 📸")

    def cas(self):
        self.baterai_persen = 100
        print(f"[{self.merek} {self.model}] Baterai penuh: 100%")

    def tampilkan_info(self):
        print(f"  Ponsel    : {self.merek} {self.model}")
        print(f"  Layar     : {self.ukuran_layar} inch")
        print(f"  Baterai   : {self.kapasitas_baterai} mAh ({self.baterai_persen}%)")

