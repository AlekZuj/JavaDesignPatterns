package net.ukr.zuj_as.adapter.enumerationa_iterators;

import java.util.*;

public class EnumerationIteratorTestDrive {

    public static void main(String args[]) {
		List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five");
		Vector v = new Vector(list);
		Iterator iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
    }
}
