package services;

import java.util.List;

public class CalculationService {

    public static <T extends Comparable<? super T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Esta lista está vazia!");
        }
        T max = list.get(0);
        for (T f : list) {
            if (f.compareTo(max) > 0) {
                max = f;
            }
        }
        return max;
    }
}
