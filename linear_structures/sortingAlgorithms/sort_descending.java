import java.util.Arrays;

public class sort_descending {
	public static void main(String[] args) {
		int arr[] = { -1, -2, 0, 1, 2, 3, 4, 5 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j + 1] > arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	static void insertionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] > arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}
		}
	}

	static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int max = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		}
	}
}