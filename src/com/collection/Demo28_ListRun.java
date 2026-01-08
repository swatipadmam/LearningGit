package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo28_ListRun {

	public static void main(String[] args) {
		//List lst = new List();
		//hold the data : list
		
		//ArrayList <String> arrl = new ArrayList();
		
		LinkedList <String> arrl = new LinkedList();

		arrl.add("ABC");
		arrl.add("DEF");
		arrl.add("ABC");
		arrl.add("ghj");


		
		System.out.println(arrl);
		System.out.println(arrl.size());
		System.out.println(arrl.contains("ABC"));
		//search data
		for(int i =0;i< arrl.size();i++) {
			System.out.println(arrl.get(i));
		}
		
		arrl.remove(2);
		System.out.println(arrl);
		
		/*Output : [ABC, DEF, ABC, ghj]
4
true
ABC
DEF
ABC
ghj
[ABC, DEF, ghj] : both linkedlist and arraylist output will same
*/


	}

}
