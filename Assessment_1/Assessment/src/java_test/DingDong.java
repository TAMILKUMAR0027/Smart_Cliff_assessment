package java_test;
import java.util.*;
public class DingDong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end =s.nextInt();
		int c=0;
		for(int i=start;i<=end;i++) {
			c++;
			if(c%10==0) {
				System.out.print("dong ");
			}
			else if(c%5==0) {
				System.out.print("ding ");
			}else {
				System.out.print(i+" ");
			}
		}
	}

}
