package 일차원배열;

public class ex01배열기초 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		String stu1 = "조미소";
		//		String stu2 = "조자연";
		//		String stu3 = "박호용";
		//		
		//		for (int i=1; i<=3; i++) {
		//			System.out.println(stu+i);
		//		}
		
		String [] stu = new String [3];
		stu[0] = "조미소";
		stu[1] = "조자연";
		stu[2] = "박호용";
		for (int i=0 ; i< stu.length; i++) {
			System.out.println(stu[i]);
		}
		String[] 사무실 = {"이명훈", "박병관", "송승호", "조자연"};
		for (int i=0 ; i < 사무실.length; i++) {
			System.out.println(사무실[i]);
		}
		
	}

}
