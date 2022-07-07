package interview.pratice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class PraticeArraylist {
	
	public static class JavacollectionBasic{
		
	
	
	static	List<String>myArrayList =new ArrayList<>();
		List<String>myList1 =new LinkedList<>();
		List<String>myList2 =new Vector<>();
		List<Double>mySet3 = new Stack<>();
		
	static Set<Integer>myHashSet = new HashSet<>();
		Set<Double>mySet1 = new LinkedHashSet<>();
		Set<String>mySet2= new TreeSet<>();
		
		
	static Map<Double,String>myHashMap = new HashMap<>();
		Map<Integer,String>myMap2 = new LinkedHashMap<>();
		Map<Integer, Integer>myMap3 = new TreeMap<>();
		Map<Double,Double>myMap4 = new Hashtable<>();
		Map<String,String>myMap5 = new ConcurrentHashMap<>();
		
		public static void main(String[] args) {
			myArrayList.add("Sarower");
			myArrayList.add("Sarower");
			myArrayList.add("5000");
			//System.out.println("This is arrayList ="+myArrayList);
			//myArrayList.forEach(a->{ System.out.println(a);});
			
			myArrayList
			.stream()
			.filter(a->a.contains("5000"))
			.forEach(a->{ System.out.println(a);});
			
			myHashSet.add(2);
			myHashSet.add(2);
			myHashSet.add(5);
			
			//myHashSet.forEach(b->{ System.out.println(b);});
			myHashSet
			.stream()
			.filter(b->b == 5)
			.forEach(b->{ System.out.println(b);});
			
			myHashMap.put(2.75,"Roly");
			myHashMap.put(3.50,"5000");
			//myHashMap.put("Roly","40");
			
			myHashMap
			.entrySet()//pair value
			.stream()// api
			.filter(x->x.getValue().contains("40"))//if else
			.forEach(x->{ System.out.println(x);});//loop
			
			

			
		}
		
	}

}
