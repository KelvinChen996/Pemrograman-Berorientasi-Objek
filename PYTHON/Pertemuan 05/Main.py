import sys
sys.stdout.reconfigure(encoding='utf-8')
import KonstruktorJava

def main():
    while True:
        print("\n=== MENU PRAKTIKUM PERTEMUAN 05 ===")
        print("1. Jalankan KonstruktorJava")
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
            KonstruktorJava.main()
        else:
            print("Pilihan tidak ada di menu.")
        print("-------------------------------------------------")

if __name__ == "__main__":
    main()

