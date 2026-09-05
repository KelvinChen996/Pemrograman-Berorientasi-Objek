import sys
sys.stdout.reconfigure(encoding='utf-8')
def cek_ganjil_genap():
    print("\n--- 1. Cek Ganjil / Genap ---")
    try:
        angka = int(input("Masukkan sebuah angka integer: "))
        if angka % 2 == 0:
            print(f"-> {angka} adalah bilangan GENAP.")
        else:
            print(f"-> {angka} adalah bilangan GANJIL.")
    except ValueError:
        print("Input tidak valid.")

def hitung_deret():
    print("\n--- 2. Hitung Deret Angka ---")
    try:
        batas = int(input("Masukkan batas maksimal deret: "))
        total = 0
        print("Deret: ", end="")
        for i in range(1, batas + 1):
            print(f"{i}", end=("" if i == batas else " + "))
            total += i
        print(f"\nTotal Jumlah = {total}")
    except ValueError:
        print("Input tidak valid.")

def kalkulator_sederhana():
    print("\n--- 3. Kalkulator Sederhana ---")
    try:
        num1 = float(input("Masukkan angka pertama: "))
        num2 = float(input("Masukkan angka kedua: "))
        op = input("Pilih operasi (+, -, *, /): ")
        
        hasil = 0.0
        valid = True
        
        if op == '+':
            hasil = num1 + num2
        elif op == '-':
            hasil = num1 - num2
        elif op == '*':
            hasil = num1 * num2
        elif op == '/':
            if num2 != 0:
                hasil = num1 / num2
            else:
                print("Error: Pembagian dengan nol tidak diizinkan.")
                valid = False
        else:
            print("Operasi tidak dikenal!")
            valid = False
        
        if valid:
            print(f"Hasil: {num1:.2f} {op} {num2:.2f} = {hasil:.2f}")
    except ValueError:
        print("Input tidak valid.")

def main():
    print("=========================================")
    print("TUGAS LATIHAN MANDIRI - PERTEMUAN 02")
    print("=========================================\n")

    print("Pilih menu latihan:")
    print("1. Cek Bilangan Ganjil/Genap")
    print("2. Hitung Deret Angka")
    print("3. Kalkulator Sederhana")
    
    try:
        pilihan = int(input("Pilihan (1-3): "))
        if pilihan == 1:
            cek_ganjil_genap()
        elif pilihan == 2:
            hitung_deret()
        elif pilihan == 3:
            kalkulator_sederhana()
        else:
            print("Pilihan tidak valid!")
    except ValueError:
        print("Pilihan tidak valid!")
        
    print("\nProgram Selesai.")

if __name__ == "__main__":
    main()

