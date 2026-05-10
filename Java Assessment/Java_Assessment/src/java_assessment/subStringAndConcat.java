package java_assessment;

import java.util.Scanner;

public class subStringAndConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String st = s.next();
		String result = "";
		if (st.length() >= 2) {
			result = st.substring(0, 2);
		} else if (st.length() == 1) {
			result = st + "@";
		} else if (st.length() == 0)
			result = "@@";
		System.out.println(result);
	}

}
