package java_test;
import java.util.*;
public class LuckyDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("No of Participants ");
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>999&&arr[i]<10000) {
				int k=arr[i]%9;
				if(k==7) {
					System.out.println("The first prize is to token : "+arr[i]);
				}else if(k==5) {
					System.out.println("The second prize is to token : "+arr[i]);
				}else if(k==3) {
					System.out.println("The third prize is to token : "+arr[i]);
				}
			}
		}
	}

}
