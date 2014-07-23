import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		quickSort(new int[]{1, 2, 3, 4, 5, 6, 7});		
		quickSort(new int[]{7, 6, 5, 4, 3, 2, 1});		
		quickSort(new int[]{29, 32, 4, 16, 9, 24, 88});		
		quickSort(new int[]{29, 3, 4, 16, 9, 24, 18});
	}
	
	public static void quickSort(int[] data){
		System.out.println(Arrays.toString(data));
		
		if(data == null) return;
		if(data.length <= 1) return;
		
		quickSort(data, 0, data.length - 1);
		
		System.out.println(Arrays.toString(data));
		System.out.println();
	}
	
	private static void quickSort(int[] data, int m, int n){
		if(m == n) return;
		
		int p = 0;
		for(int i = m + 1, j = n; i <= j; i++){
			if(data[i] > data[m]){
				for(; i < j; j--){
					if(data[j] <= data[m]){
						swap(data, i, j);
						p++;
						break;
					}
				}
			}else{
				p++;
			}
		}

		swap(data, m, m + p);
		
		if(p > 1) quickSort(data, m, m + p - 1);
		if(n - m - p > 1) quickSort(data, m + p + 1, n);
	}
	
	private static void swap(int[] data, int i, int j){
		int x = data[i];
		data[i] = data[j];
		data[j] = x;
	}


}
