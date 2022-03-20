package net.ukr.zuj_as.adapter.enumerationa_iterators;

import java.util.*;

public class EI {
    public static void main(String args[]) {
        Vector v = new Vector(initListOfRandomInt(10, 10));
        Enumeration enumeration = v.elements();
        System.out.println("Enumeration:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        Iterator iterator = v.iterator();
        System.out.println("Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static List<Integer> initListOfRandomInt(int capacity, int randomMaxValue) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            list.add(random.nextInt(randomMaxValue));
        }
        return list;
    }
}
