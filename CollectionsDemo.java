//15.Java program using Collections

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {
	public static void main(String [] args){
		List<String> list= new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");

		for (String fruit: list){
			System.out.println(fruit);	
		}
	}
}