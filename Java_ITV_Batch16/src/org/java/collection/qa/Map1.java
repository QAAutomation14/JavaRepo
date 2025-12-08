package org.java.collection.qa;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(144444, "Amitabh");
		map.put(200, "Rishabh Setty");
		map.put(3, "Hero");
		map.put(4000, "National Hero");

		System.out.println(map);

		for (Map.Entry allValues : map.entrySet()) {

			System.out.println(allValues.getKey() + "-> " + allValues.getValue());
		}
		
		System.out.println("Treemap------------------------------");
		
		Map<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(144444, "Amitabh");
		treeMap.put(200, "Rishabh Setty");
		treeMap.put(3, "Hero");
		treeMap.put(4000, "National Hero");

		System.out.println(treeMap);

		for (Map.Entry allValues : treeMap.entrySet()) {

			System.out.println(allValues.getKey() + "-> " + allValues.getValue());
		}
		

	}

}
