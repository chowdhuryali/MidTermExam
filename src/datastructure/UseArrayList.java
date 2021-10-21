package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

        //implementation here

		ArrayList<String> arrayList =new ArrayList<>();
		arrayList.add("New York");
		arrayList.add("New Jersey");
		arrayList.add("Tampa");
		arrayList.add("Los Angeles");

		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i)+" ");
		}


		arrayList.remove("Tampa");


		Iterator it = arrayList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());

		}
	}
}


//connect to db
