import sys
sys.stdout.reconfigure(encoding='utf-8')
class JamTangan:
    def __init__(self, merek: str, model: str, water_resistant: bool):
        self.merek = merek
        self.model = model
        self.water_resistant = water_resistant
        self.jam = 7
        self.menit = 0

    def set_waktu(self, jam: int, menit: int):
        if 0 <= jam < 24 and 0 <= menit < 60:
            self.jam = jam
            self.menit = menit
            print(f"[Jam {self.merek}] Waktu diatur: {jam:02d}:{menit:02d}")

    def tampilkan_waktu(self):
        print(f"[Jam {self.merek}] Waktu sekarang: {self.jam:02d}:{self.menit:02d}")

    def aktifkan_alarm(self, jam_alarm: int, menit_alarm: int):
        print(f"[Jam {self.merek}] Alarm diset: {jam_alarm:02d}:{menit_alarm:02d} ⏰")

    def tampilkan_info(self):
        print(f"  Jam       : {self.merek} {self.model}")
        print(f"  Waktu     : {self.jam:02d}:{self.menit:02d}")
        print(f"  WR        : {'Ya' if self.water_resistant else 'Tidak'}")

