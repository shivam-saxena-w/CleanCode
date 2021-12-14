public class MainClass {

	static class Content {

		int numOne;
		int numTwo;
	}

	static Content functionOne(int arr[], int length) {
		Content nums = new Content();
		
		if (length == 1) {
			nums.numTwo = arr[0];
			nums.numOne = arr[0];
			return nums;
		}

		if (arr[0] > arr[1]) {
			nums.numTwo = arr[0];
			nums.numOne = arr[1];
			} else {
			nums.numTwo = arr[1];
			nums.numOne = arr[0];
		}

		for (int loopVariable = 2; loopVariable < length; loopVariable++) {
			if (arr[loopVariable] > nums.numTwo) {
				nums.numTwo = arr[loopVariable];
			} else if (arr[loopVariable] < nums.numOne) {
				nums.numOne = arr[loopVariable];
			}
		}

		return nums;
	}


	public static void main(String args[]) {
		int arr[] = {1000, 11, 445, 1, 330, 3000};
		int length = 6;
		Content nums = functionOne(arr, length);
		System.out.printf("\nnum one is %d", nums.numOne);
		System.out.printf("\nnum two is %d", nums.numTwo);
	}
}