import sys
sys.stdout.reconfigure(encoding='utf-8')
import LandasanKonsepOOP

def main():
    while True:
        print("\n=== MENU PRAKTIKUM PERTEMUAN 03 ===")
        print("1. Jalankan LandasanKonsepOOP")
        print("0. Keluar")
        
        try:
            pilihan = int(input("Pilihan Anda: "))
        except ValueError:
            print("Input tidak valid!")
            continue
            
        if pilihan == 0:
            print("Keluar dari menu.")
            break
            
        print("-------------------------------------------------")
        if pilihan == 1:
            LandasanKonsepOOP.main()
        else:
            print("Pilihan tidak ada di menu.")
        print("-------------------------------------------------")

if __name__ == "__main__":
    main()

