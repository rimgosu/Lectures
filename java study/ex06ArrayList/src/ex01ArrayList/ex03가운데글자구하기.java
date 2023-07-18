package ex01ArrayList;

public class ex03가운데글자구하기 {

	public static String getMiddle(String s) {
		if (s.length() %2 ==0) {
			char c1 = s.charAt(s.length()/2-1);
			char c2 = s.charAt(s.length()/2);
			return ""+ c1 + c2;
		} else {
			char c = s.charAt(s.length()/2);
			System.out.println(Character.toString(c));
			
			return "" + c;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMiddle("power"));
//		System.out.println(getMiddle("power2"));
//		System.out.println(getMiddle("Hello world"));
//		System.out.println(getMiddle("Hello world!"));
	}

}
