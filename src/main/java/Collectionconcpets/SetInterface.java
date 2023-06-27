package Collectionconcpets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
	
	public void setimplementation()
	{
		//HashSet<Integer> a = new HashSet<>();
		// LinkedHashSet<Integer> a = new LinkedHashSet<>();
		TreeSet<Integer> a = new TreeSet<>();
		
		Object a1 = new HashSet<>();
		
		//add
		a.add(4);
		a.add(2);
		a.add(0);
		a.add(6);
		a.add(6);
		//delete
		a.remove(0);
		//update
		// a.set(1, 6);
		
		//get the value from the lkist
		Iterator it= a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(int eachvalue : a)
		{
			System.out.println(eachvalue);
		}
		
		System.out.println(a.isEmpty());
		a1=a.clone();
		System.out.println(a.contains(6));
		a.clear();
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetInterface s = new SetInterface();
		s.setimplementation();
	}

}
