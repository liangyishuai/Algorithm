package com.aliano.sort;

public class HashSort {

    public static void sort(Integer[] a) {
        int h = 1;
        int total = a.length;

        while (h < total / 3) {
            h = h * 3 + 1;
        }

        while (h >= 1) {
            for (int i = h; i < total; i++) {

                for (int j = i; j >= h; j -= h) {
                    if (less(a, j, j - h))
                        excha(a, j, j - h);
                }

            }
            h = h / 3;
        }
    }

    public static boolean less(Integer[] a, int i, int j) {
        return a[i] >= a[j];
    }

    public static void excha(Integer[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 5, 6, 4, 8, 52, 7, 4, 5, 21, 4};
        sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
