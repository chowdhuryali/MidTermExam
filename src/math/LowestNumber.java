package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */


		//implementation here...

		int temp, size;
		int array[] = {11, 21, 31, 41, 51, 61};
		size = array.length;

		for(int i = 0; i<size; i++){
			for (int k = i+1; k<size; k++){
				if (array[i]>array[k]){
					temp = array[i];
					array[i] = array[k];
					array[k] = temp;
				}
			}

		}
		System.out.println("LowestNumber in the Array is: " +array[0]);
	}
}
