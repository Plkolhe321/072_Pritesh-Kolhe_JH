class InsertionSort{

void insertionSort(int[] a1,int n){
	
	for(int i=1; i < n; i++){
		int key = a1[i];
		int j = i-1;
		
		while(j >= 0 && a1[j] > key){
			a1[j+1] = a1[j];
			j--;
			
	for(int val : a1){
		System.out.print(val+" ");
	}
	System.out.println();
	}
		a1[j+1] = key;
	}
	
		for(int val : a1){
		System.out.print(val+" ");
	}
}

public static void main(String[] args){
	
	InsertionSort ins = new InsertionSort();
	
	int[] a1 = {2,4,6,8,3};
	int n = a1.length;
	
	ins.insertionSort(a1,n);
}
}