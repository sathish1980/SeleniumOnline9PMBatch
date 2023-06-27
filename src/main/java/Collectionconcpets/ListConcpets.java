package Collectionconcpets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListConcpets {
	
	public void arrayList()
	{
		//ArrayList<Integer> a = new ArrayList<>();
		LinkedList<Integer> a = new LinkedList<>();
		Object a1 = new ArrayList<>();
		//add
		a.add(3);
		a.add(4);
		a.add(0);
		a.add(7);
		a.add(6);
		//delete
		a.remove(0);
		//update
		a.set(1, 6);
		
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
		
	}
	
	public void array()
	{
	int[] age1 = new int[5];
	// intArray = new int[20];
	//int[] age = {1,2,3,4,5};
	age1[0] =1;
	age1[1] =1;
	age1[2] =1;
	age1[3] =1;
	age1[4] =1;
	// age1[5] =1;
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListConcpets L = new ListConcpets();
		L.arrayList();
	}

}
