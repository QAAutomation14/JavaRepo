package org.java.collection.qa;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class SetAndQueue {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();


		set.add(352);
		set.add(334);
		set.add(17);
		set.add(17);
		set.add(8);
		set.add(999);
		System.out.println(set.size());

		for (int allValues : set) {
			System.out.println(allValues);
		}
		System.out.println("----------------------");
		set.remove(8);
		for (int allValues : set) {
			System.out.println(allValues);
		}
		System.out.println("----------------------");
		
		Set<Integer> set2 = new LinkedHashSet<>();

		set2.add(352);
		set2.add(334);
		set2.add(17);
		set2.add(17);
		set2.add(8);
		set2.add(999);

		for (int allValues : set2) {
			System.out.println("LinkedHashset- "+allValues);
		}
		
	System.out.println("----------------------");
		
		Set<Integer> set3 = new TreeSet<>();

		set3.add(352);
		set3.add(334);
		set3.add(17);
		set3.add(17);
		set3.add(8);
		set3.add(999);
		set3.add(352);
		set3.add(352);
		set3.add(352);

		for (int allValues : set3) {
			System.out.println("TreeSet- "+allValues);
		}
		System.out.println("Queue--------------");
		
		Queue<Integer> q=new PriorityQueue<>();//FIFO
		q.add(45434);
		q.add(365365);
		q.add(47684);
		
		for (int allValues : q) {
			System.out.println("PriorityQueue- "+allValues);
		}
		
		Deque<Integer> q2=new ArrayDeque<>();//LiFO
		
		q2.add(45434);
		q2.add(365365);
		q2.add(47684);
		
		for (int allValues : q2) {
			System.out.println("ArrayDeque- "+allValues);
		}
	}

}
