package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyOwnLists {

    public static <T> List <T> asListedSorted(T[] array, Comparator<T> comparador) {
        List<T> lista = Arrays.asList(array);
        lista.sort(comparador);
        return lista;
    }

}
