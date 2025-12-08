package org.java.collection.qa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();// Retrieving or fetching the value

		list.add(51);
		list.add(455);
		list.add(452465);

		System.out.println("Using For Each loop-----------");
		for (int all : list) {
			System.out.println(all);
		}

		System.out.println("Using Itetrator-----------");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {//true
			int all = it.next();//next value
			System.out.println(all);//print
		}

		list.remove(1);
		
		System.out.println("Using For Each loop-----------");
		for (int all : list) {
			System.out.println(all);
		}
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.isEmpty());
		
		
		System.out.println("LinkedList Class-------------");
		
		LinkedList<String> ll=new LinkedList<>();
		ll.add("ABC");
		ll.add("XYZ");
		ll.add("PQR");
		ll.add("itr");
		
		System.out.println(ll);
		for (String allValues:ll) {
			System.out.println(allValues);
		}
		
		ll.remove();
		
		for (String allValues:ll) {
			System.out.println(allValues);
		}
		
		
		
	}

}
