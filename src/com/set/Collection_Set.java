package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_Set {

	public static void main(String[] args) {

		Set<Object> ref = new LinkedHashSet<Object>();

		ref.add(100);
		ref.add("yoga");
		int a = ref.size();
		System.out.println("Size of the set: " + a);
		System.out.println("Print the set: " + ref);
		ref.remove(100);
		System.out.println("After remove:" + ref); 
		boolean b = ref.contains(100);
		System.out.println("After remove:" + b);

		Set<Object> ref1 = new HashSet<Object>();
		ref1.add(52);
		ref1.add("Babu");
		ref1.addAll(ref);
		System.out.println("After Adding ref& ref1: " + ref1);
		ref1.retainAll(ref);
		System.out.println("After retaining: " + ref1);
		ref1.removeAll(ref);
		System.out.println("After Removeall: " + ref1);
		ref.clear();
		System.out.println("After giving clear: " + ref);
	//.get(),.set()and .indexof() methods cannot be used in set 
	//because set is value based not index based.
	}

}
