package datastructure;

import databases.ConnectDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class UseMap {

	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		//implementation here

		Map<String, List<String>> mapOfList = new HashMap<String,List<String>>();

		List<String> map = new ArrayList<String>();
		map.add("Tampa");
		map.add("New York");
		map.add("Los Angeles");

		mapOfList.put("Tampa", map);
		mapOfList.put("New York", map);
		mapOfList.put("Los Angeles", map);

		System.out.println(mapOfList);
		System.out.println(mapOfList.size());
		System.out.println(mapOfList.get(1));

		for (int i = 0; i < mapOfList.size(); i++) {
			System.out.println(mapOfList.get(i) + " ");

		}
		Iterator it = mapOfList.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}
}


//connect to database