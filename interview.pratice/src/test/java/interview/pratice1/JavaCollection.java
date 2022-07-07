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
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class JavaCollection {
	
	String name ="Roly";
	String myString = new String("Smarttech");
	StringBuffer myStringBuffer = new StringBuffer("Alam");
	StringBuilder myStringBuilder = new StringBuilder ("Roly");
	
	int [] myArrayList = {10,20};
	List<Integer> myArray = new ArrayList<>();
	List<String> myLinkedlist = new LinkedList<>();
	List<Double> myVector =new Vector<>();
	
	

    Set<String> myHashSet = new HashSet<>();
    Set<String> myLinkedHashSet = new LinkedHashSet<>();
    Set<String> myTreeSet = new TreeSet<>();
    
    
    Map<String,Integer> myHashmap = new HashMap<>();
    Map<String,String> myLinkedHashmap = new LinkedHashMap<>();
    Map<String,Double> myTreemap = new TreeMap<>();
    Map<String,Boolean> myHashTable = new Hashtable<>();
    Map<String,Integer> myConcurrentHashMap = new ConcurrentHashMap<>();
    
    
    
    
    
    
}
