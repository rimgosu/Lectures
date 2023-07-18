package 뮤직플레이어;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean breaker = false;
		/*
		 * 노래를 실행, 정지해주는 객체
		 */
		String basePath = "C:\\Users\\aischool\\Desktop\\mp3\\";
		MP3Player mp3 = new MP3Player();
		// mp3.play("뉴진스-HypeBoy.mp3");
		
		
		/*
		 * 1.가수명(String) 2.노래제목(String) 3.출시년도(int) 4 시간초(int)
		 */
		ArrayList<Music> list = new ArrayList<>();
		Music m1 = new Music("뉴진스", "HypeBoy", 2022, 179, basePath+"뉴진스-HypeBoy.mp3");
		Music m2 = new Music("르세라핌", "Antifragile", 2023, 352, basePath+"르세라핌-Antifragile.mp3");
		Music m3 = new Music("아이브", "LoveDive", 2022, 385, basePath+"아이브-LoveDive.mp3");
		Music m4 = new Music("윤하", "사건의지평선", 2021, 300, basePath+"윤하-사건의지평선.mp3");
		Music m5 = new Music("카라", "WhenIMove", 2022, 193, basePath+"카라-WhenIMove.mp3");
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		Music mu = new Music();
		mu.setListNumber(0);
		
		
		while(true) {
			System.out.print("1.재생 2.정지 3.이전곡 4.다음곡 5.목록 6.종료 >> ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				mu.__1__(list, mu.getListNumber());
				break;
			case 2:
				mu.__2__();
				break;
			case 3:
				int prev = mu.getListNumber();
				if (mu.getListNumber() == 0) {
					mu.setListNumber(list.size()-1);	
				}else {
					prev = mu.getListNumber()-1;
					mu.setListNumber(prev);
				}
				mu.__3__(list, mu.getListNumber());
				break;
			case 4:
				int nxt;
				if (list.size() == mu.getListNumber()+1) {
					mu.setListNumber(0);	
				}else {
					nxt = mu.getListNumber()+1;
					mu.setListNumber(nxt);
				}
				mu.__4__(list, mu.getListNumber());
				break;
			case 5:
				mu.__5__(list);
				break;
			case 6:
				mu.__2__();
				breaker = true;
				break;
			}
			if(breaker) {
				break;
			}
		}
	}
}
