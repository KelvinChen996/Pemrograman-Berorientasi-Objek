package id.ac.uph.pbo.pertemuan12;

import java.util.*;

public class GenericStack<T extends Comparable<T>> {
    private Object[] data;
    private int      top;
    private int      kapasitas;

    @SuppressWarnings("unchecked")
    GenericStack(int kapasitas) {
        this.kapasitas = kapasitas;
        this.data      = new Object[kapasitas];
        this.top       = -1;
    }

    void push(T item) {
        if (top < kapasitas - 1) {
            data[++top] = item;
            System.out.println("  Push: " + item + " | Size: " + size());
        } else System.out.println("  Stack penuh!");
    }

    @SuppressWarnings("unchecked")
    T pop() {
        if (top >= 0) {
            T item = (T) data[top--];
            System.out.println("  Pop : " + item + " | Size: " + size());
            return item;
        }
        System.out.println("  Stack kosong!");
        return null;
    }

    @SuppressWarnings("unchecked")
    T peek() { return top >= 0 ? (T) data[top] : null; }

    int     size()   { return top + 1; }
    boolean isEmpty(){ return top == -1; }

    @SuppressWarnings("unchecked")
    T max() {
        if (isEmpty()) return null;
        T maks = (T) data[0];
        for (int i = 1; i <= top; i++) {
            if (((T) data[i]).compareTo(maks) > 0) maks = (T) data[i];
        }
        return maks;
    }
}
