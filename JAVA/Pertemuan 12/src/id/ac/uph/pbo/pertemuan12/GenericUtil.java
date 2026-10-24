package id.ac.uph.pbo.pertemuan12;

import java.util.*;

public class GenericUtil {

    // Generic method: swap dua elemen dalam array
    static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
    }

    // Generic method: cari maksimum dari array (T harus Comparable)
    static <T extends Comparable<T>> T maks(T[] arr) {
        T hasil = arr[0];
        for (T item : arr) if (item.compareTo(hasil) > 0) hasil = item;
        return hasil;
    }

    // Wildcard: cetak semua elemen List (List<?> menerima List<Integer>, List<String>, dll)
    static void cetakList(List<?> list) {
        System.out.print("  [");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + (i < list.size()-1 ? ", " : ""));
        }
        System.out.println("]");
    }

    // Upper bounded wildcard: hanya menerima List<Number> atau subclassnya
    static double jumlahkanSemua(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) total += n.doubleValue();
        return total;
    }
}
