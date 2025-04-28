package com.springliviu.arrayutils;
import java.util.*;

public class ArrayUtils {

    /** Сумма элементов */
    public static int sum(int[] arr) {
        int total = 0;
        for (int v : arr) {
            total += v;
        }
        return total;
    }
    // (Идея: проходим по каждому элементу и накапливаем сумму) :contentReference[oaicite:3]{index=3}

    /** Обратный порядок */
    public static int[] reverse(int[] arr) {
        int n = arr.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }
        return rev;
    }
    // (swap двух указателей с концов) :contentReference[oaicite:4]{index=4}

    /** Минимум и максимум */
    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int min = arr[0], max = arr[0];
        for (int v : arr) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        return new int[]{min, max};
    }
    // (линейный проход для нахождения min и max) :contentReference[oaicite:5]{index=5}

    /** Удаление дубликатов */
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int v : arr) set.add(v);
        int[] result = new int[set.size()];
        int i = 0;
        for (int v : set) result[i++] = v;
        return result;
    }
    // (использование Set для автоматического удаления дубликатов) :contentReference[oaicite:6]{index=6}

    /** Линейный поиск */
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }
    // (последовательная проверка каждого элемента) :contentReference[oaicite:7]{index=7}

    /** Бинарный поиск (массив должен быть отсортирован) */
    public static int binarySearch(int[] arr, int key) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }
    // (делим область поиска пополам в отсортированном массиве) :contentReference[oaicite:8]{index=8}
}