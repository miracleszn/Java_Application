//<T> can be any type
//generics allow you to write flexible and resuable code that works with different type
//it is a placeholder for a datatype<>

import java.util.ArrayList;

public class ArrayLists{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("John");
		list.add("Henry");
		list.add("Mary");
		list.add("Jack");
		list.add("Blessing");
		
		//adding a value to a particular index
		list.add(2, "Clinton");
		
		//updating by using the set method
		list.set(3, "Peter");
		
		//removing element with item name
		list.remove("Henry");
		
		//removing element with index number
		list.remove(3);
		
		//clearing the whole list
		//list.clear();
		
		//updating by using the set method
		list.set(3, "Peter");
		
		
		//using the list.get() to print an item in the specified index
		
		System.out.println(list.get(3));
		
		for(String name : list){
			System.out.printf("%s%n", name);
		}
		
	}
}