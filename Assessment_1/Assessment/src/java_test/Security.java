package java_test;
import java.util.*;
public class Security {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int z=s.nextInt();
		int password=0;
		int m1=0,m2=0,m3=0;
		if((n>99 && n<1000)&&(m>99&& m<1000)&&(z>99 && z<1000)) {
			int ones=0,tens=0,hun=0;
			if(n%10<m%10 && n%10<z%10)
				ones=n%10;
			else if(m%10<n%10 && m%10<z%10)
				ones=m%10;
			else
				ones=z%10;
			if(n%10>m%10 && n%10>z%10)
				m1=n%10;
			else if(m%10>n%10 && m%10>z%10)
				m1=m%10;
			else
				m1=z%10;
			 
			n/=10;
			m/=10;
			z/=10;
			password+=ones;
			if(n%10<m%10 && n%10<z%10)
				tens=n%10;
			else if(m%10<n%10 && m%10<z%10)
				tens=m%10;
			else
				tens=z%10;
			if(n%10>m%10 && n%10>z%10)
				m2=n%10;
			else if(m%10>n%10 && m%10>z%10)
				m2=m%10;
			else
				m2=z%10;
			
			n/=10;
			m/=10;
			z/=10;
			password+=tens*10;
			if(n%10<m%10 && n%10<z%10)
				hun=n%10;
			else if(m%10<n%10 && m%10<z%10)
				hun=m%10;
			else
				hun=z%10;
			if(n%10>m%10 && n%10>z%10)
				m3=n%10;
			else if(m%10>n%10 && m%10>z%10)
				m3=m%10;
			else
				m3=z%10;
			password+=hun*100;
			
		}
		int max=Math.max(m1,Math.max(m2, m3));
		password+=max*1000;
		System.out.println(password);
		
	}

}
