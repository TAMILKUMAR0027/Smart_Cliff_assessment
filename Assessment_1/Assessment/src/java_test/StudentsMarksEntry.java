package java_test;
import java.util.*;
public class StudentsMarksEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the scores (enter a negative number to stop input)");
		int[] arr=new int[100];
		int k=0;
		while(true) {
			int n=s.nextInt();
			if(n<0) {
				break;
			}
			arr[k++]=n;
		}
		System.out.println("Scores before processing: ");
		for(int i=0;i<k;i++) {
			System.out.print(arr[i]+" ");
		}
		for (int i = 0; i < k; i++) {
		    int max=-1;   
		    
		    if (arr[i]%8==0)
		        max=2;
		    else if (arr[i]%2==0)
		        max=Math.max(max,0);
		    if (arr[i]%2!=0)
		        max=Math.max(max,1);
		    
		    if (arr[i]%10==3)
		        max=Math.max(max,3);
		    if (arr[i]%9==0)
		        max=Math.max(max, 4);
		    arr[i]=max;   
		}

		System.out.println("Scores after processing: ");
		for(int i=0;i<k;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
