package collectionDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// It stores data as key and value pair
		// It does'nt support index based insertion and deletion
		HashSet<String> cities = new HashSet<>();
		
		cities.add("London");
		cities.add("New York");
		cities.add("Delhi");
		cities.add("Hyderabad");
		
		// print the hash set
		// elements will be printed into random sequence
		
		for(String t: cities)
		{
			// Print the size of the Hash Set
			System.out.println(t);
		}
		
		// Print the size of the Hash Set
		
		System.out.println(cities.size());
		
		//Check if set contains an element
		System.out.println(cities.contains("Tokyo"));
		

	}

}
