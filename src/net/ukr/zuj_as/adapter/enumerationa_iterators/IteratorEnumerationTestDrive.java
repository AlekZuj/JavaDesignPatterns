package net.ukr.zuj_as.adapter.enumerationa_iterators;

import java.util.*;

public class IteratorEnumerationTestDrive {

	public static void main (String args[]) {
		List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five");
		Enumeration enumeration = new IteratorEnumeration(list.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
