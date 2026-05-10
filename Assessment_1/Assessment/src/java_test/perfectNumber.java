package java_test;
import java.util.*;
public class perfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println("The given number is perfect ");
		}else {
			System.out.println("The given number is not perfect ");
		}
	}

}
