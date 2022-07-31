package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array1 = {"abc", "pqr", "xyz", "asdasd", "rtert"};
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list1.add("John");
		list1.add("Leeana");
		list1.add("Ruchi");
		list1.add("Shiru");
		list1.add("Himanshu");
		
		list2.add(2);
		list2.add(3);
		
		System.out.println("List is this " + list1);
		System.out.println("Size of Array List is " + list1.size());
		System.out.println("List is this " + list2);
		
		list1.remove(1);
		
		System.out.println("List is this after removing Leeana " + list1);
		System.out.println("Size of Array List is " + list1.size());
		
		System.out.println("The data at 4th position is " + list1.get(3));
		
		list1.set(0, "James");
		System.out.println("List is this after replacing John " + list1);
		
		list1.add(1, "Leeana");
		System.out.println("List is this after adding Leeana again " +list1);
		
		Collections.sort(list1);
		System.out.println("List is after sort " + list1);
		
		Collections. sort(list1, Collections.reverseOrder()) ;
		System.out.println("List is reverse sort " + list1);
		
		
		for(int index=0; index<list1.size(); index++) {
		
		System.out.println(list1.get(index));
		
		}
		
		for(String name:list1) {
			System.out.println(name);
		}
		
		for(int index=0; index<list1.size(); index++) {
			
		if(list1.get(index).equals("Priyanka")){
            System.out.println(index);
            break;
        }

	}
}
}
