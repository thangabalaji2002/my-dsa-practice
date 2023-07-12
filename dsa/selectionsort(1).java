package dsa;

public class selectionsort {
		public static void sort(int arr[]) {
			for(int i =0;i<arr.length;i++) {
				int max_inx=i;
				
				for (int j=i+1;j<arr.length;j++) {
					if(arr[j]>arr[max_inx]) {
						max_inx=j;
						
					}}
					int temp=arr[i];
					arr[i]=arr[max_inx];
					arr[max_inx]=temp;
					
					}
			}
		}
