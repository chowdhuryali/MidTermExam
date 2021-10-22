//package algorithm;
//
//import databases.ConnectDB;
//
//import java.util.List;
//import java.util.Random;
//
//public class Numbers {
//
//	/*
//	 * Show all the different kind of sorting algorithm by applying into (num array).
//	 * Display the execution time for each sorting. Example in below.
//	 *
//	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
//	 *
//	 * At the end. After running all the sorting algorithm, come to a conclusion which one is suitable on given data set.
//	 *
//	 */
//
//	public static void main(String[] args) throws Exception {
//
//		int [] num = new int[10];
//		storeRandomNumbers(num);
//		ConnectDB connectDB = new ConnectDB();
//		//Selection Sort
//		Sort algo = new Sort();
//		algo.selectionSort(num);
//		long selectionSortExecutionTime = algo.executionTime;
//		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
//		ConnectDB.insertDataFromArrayToMySql(num, "selection_sort", "SortingNumbers");
//		List<String> numbers = ConnectDB.readDataBase("selection_sort", "SortingNumbers");
//		printValue(numbers);
//		int n = num.length;
//		randomize (num, n);
//		//Insertion Sort
//		algo.insertionSort(num);
//		long insertionSortExecutionTime = algo.executionTime;
//		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
//		ConnectDB.insertDataFromArrayToMySql(num, "insertion_sort", "SortingNumbers");
//		List<String>insertionSortNumbers = ConnectDB.readDataBase("insertion_sort", "SortingNumbers");
//		printValue(insertionSortNumbers);
//		//By following above, Continue for rest of the Sorting Algorithm....
//
//		//Bubble Sort
//		algo.bubbleSort(num);
//		long bubbleSortExecutionTime = algo.executionTime;
//		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: "
//				+ bubbleSortExecutionTime + " milli sec");
//		ConnectDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumbers");
//		List<String> bubbleSortNumbers = ConnectDB.readDataBase("bubble_sort", "SortingNumbers");
//		printValue(bubbleSortNumbers);
//
////Heap sort
//		algo.heapSort(num);
//		long heapSortExecutionTime = algo.executionTime;
//		System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: "
//				+ heapSortExecutionTime + " milli sec");
//		ConnectDB.insertDataFromArrayToSqlTable(num, "heap_sort", "SortingNumbers");
//		List<String> heapSortNumbers = ConnectDB.readDataBase("heap_sort", "SortingNumbers");
//		printValue(heapSortNumbers);
////Shell Sort
//		long shellSortExecutionTime = algo.executionTime;
//		System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort take: "
//				+ shellSortExecutionTime + " milli sec");
//		ConnectDB.insertDataFromArrayToSqlTable(num, "shell_sort", "SortingNumbers");
//		List<String> shellSortNumbers = ConnectDB.readDataBase("shell_sort", "SortingNumbers");
//		printValue(shellSortNumbers);
//
//
//
//		//Come to conclusion about which Sorting Algo is better in given data set.
//
//	}
//
//	public static void storeRandomNumbers(int [] num){
//		Random rand = new Random();
//		for(int i=0; i<num.length; i++){
//			num[i] = rand.nextInt(10);
//		}
//	}
//
//	public static void randomize( int arr[], int n)
//	{
//		Random r = new Random();
//		// Start from the last element and swap one by one. We don't
//		// need to run for the first element that's why i > 0
//		for (int i = n-1; i > 0; i--) {
//			int j = r.nextInt(i);
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//		}
//	}
//	public static void printValue(List<String> array){
//		for(String st:array){
//			System.out.println(st);
//		}
//	}
//}