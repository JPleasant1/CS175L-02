
public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [50];
		int j = 0, max = 25, min =1;
		
		for (int i = 0;i<arr.length;i++) {
			arr[i] = ((int) (Math.random()*(max - min))) + min;
		}
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i]+" ");
			j++;
			if (j== 10) {
				System.out.print("\n");
				j=j-10;
			}
		}
		int small = arr[0];
		for (int i = 1; i <arr.length; i++) {
			small = Math.min(small, arr[i]);
		int large = arr[0];
		for (i = 1; i <arr.length; i++) {
			large = Math.max(large, arr[i]);
			
		System.out.println("\nLargest number of array: " + large);
		System.out.println("Smallest number of array: " + small);
		System.out.println("Product of small and largest is: " + (small + large));
		
		int count = 0, s=0;
		for (int k = 0;k <arr.length;k++) {
			int temp = arr[k];
			int tempcount = 0;
			for (i = 0;i<arr.length;i++) {
				if(arr[i] == temp) {
					tempcount++;
				}
				if(tempcount>count) {
					s=temp;
					count = tempcount;
				}
			}
		}
		System.out.println(s + " was in the array " + count + " times");
		}
	}

} }
