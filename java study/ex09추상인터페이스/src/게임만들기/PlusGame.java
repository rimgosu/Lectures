package 게임만들기;

import java.util.Random;

public class PlusGame implements GameRule{
	protected int num1;
	protected int num2;
	protected int answer;
	
	@Override
	public int random() {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int num1 = rd.nextInt(10) + 1;
		return num1;
	}

	@Override
	public String getQuizMsg() {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int num1 = rd.nextInt(10) + 1;
		int num2 = rd.nextInt(10) + 1;
		String s = "";
		s+= num1;
		s+= "+";
		s+= num2;
		this.answer = num1+num2;
		return s;
	}
	

	@Override
	public boolean checkAnswer(int ans) {
		if (this.answer == ans ) {
			return true;
		} else {
			return false;
		}
	}

}
