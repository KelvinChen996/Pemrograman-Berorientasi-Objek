import sys
sys.stdout.reconfigure(encoding='utf-8')
import math

def luas_persegi(sisi: float) -> float:
    return sisi * sisi

def luas_persegi_panjang(p: float, l: float) -> float:
    return p * l

def luas_segitiga(a: float, t: float) -> float:
    return 0.5 * a * t

def luas_lingkaran(r: float) -> float:
    return math.pi * r * r

