package p1;

public class Dupli_element {
public static void main(String[] args) {
	int key=0;
	int[] arr= {7,5,3,1,2,1,1,3,2,4,3,5,4,6,7};
	int[] temp1=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
		if(arr[j]>arr[j+1]) {
			int temp;
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
		
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
	System.out.println();
	//112233455
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]!=arr[i+1]) {
			temp1[key]=arr[i];
			key++;
			
		}
		
	}
	temp1[key]=arr[arr.length-1];
	
	
	System.out.println("***********");
	for(int i=0;i<key+1;i++) {
		System.out.print(temp1[i]);
	}
	
	
}

}
