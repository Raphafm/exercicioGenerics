package org.example;

import java.util.List;

public class App 
{
    public static void main( String[] args ) {
        String[] arrayNomes = {"Raphael", "Felipe", "Carlos", "Ana"};
        List<String> listaNomes = MyOwnLists.asListedSorted(arrayNomes, String::compareTo);
        for (String listaNome : listaNomes) {
            System.out.println(listaNome);
        }
        Integer[] arrayNumero = {5,8,9,3,4};
        List<Integer> listaNumero = MyOwnLists.asListedSorted(arrayNumero, Integer::compareTo);
        for (Integer integer : listaNumero) {
            System.out.println(integer);
        }

    }
}
