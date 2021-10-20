package algorithm;

import databases.ConnectDB;

import java.util.List;
import java.util.Random;

public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting. Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algorithm, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {

		int [] num = new int[10];
		storeRandomNumbers(num);
		ConnectDB connectDB = new ConnectDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "insertion_sort", "SortingNumbers");
		List<String> Inumbers = connectDB.readDataBase("selection_sort", "SortingNumbers");
		printValue(Inumbers);
		int In = num.length;
		randomize (num, n);
		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in BucketSort take: " + bucketSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "bucket_sort", "SortingNumbers");
		printValue(numbers);
		randomize(num,n);
		algo.bubbleSort(num);
		long bubbleSortExecutiontime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in bubbleSort Sort take: " + bubbleSortExecutiontime+ " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "bubbleSort", "SortingNumbers");
		printValue(numbers);
		randomize(num,n);
		algo.  mergeSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in merge Sort take: " + mergeSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "merge_sort", "SortingNumbers");
		printValue(numbers);
		randomize(num,n);
		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in quick Sort take: " + quickSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "quick_sort", "SortingNumbers");
		printValue(numbers);
		randomize(num,n);
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in heap Sort take: " + heapSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "heap_sort", "SortingNumbers");
		printValue(numbers);
		randomize(num,n);
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in shell Sort take: " + shellSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "shell_sort", "SortingNumbers");
		printValue(numbers);
		randomize(num,n);

		//By following above, Continue for rest of the Sorting Algorithm....



		//Come to conclusion about which Sorting Algo is better in given data set.

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(10);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
