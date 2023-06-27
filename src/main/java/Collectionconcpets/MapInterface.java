package Collectionconcpets;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInterface {
	
	public void mapexecution()
	{
		// HashMap<Integer,String> hs = new HashMap<Integer,String>();
		//LinkedHashMap<Integer,String> hs = new LinkedHashMap<Integer,String>();
		TreeMap<Integer,String> hs = new TreeMap<Integer,String>();
		
		hs.put(1, "sathish");
		hs.put(0, "sathish");
		hs.put(4, "kumar");
		hs.put(2, "r");
		hs.put(5, "Btech");
		hs.put(1, "chennai");
		
		//remove
		hs.remove(5);
		
		//update
		hs.replace(2, "sathish kumar R");
		
		//get the values
		//1.
		System.out.println(hs.get(2));
		
		System.out.println(hs.keySet());
		System.out.println(hs.values());
		
		for(String eachval: hs.values())
		{
			System.out.println(eachval);
		}
		hs.clone();
		System.out.println(hs.containsKey(4));
		System.out.println(hs.isEmpty());
		hs.clear();
		System.out.println(hs);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapInterface M = new MapInterface();
		M.mapexecution();
	}

}
