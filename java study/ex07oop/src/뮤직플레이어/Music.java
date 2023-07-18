package 뮤직플레이어;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class Music {
	/*
	 * 1.가수명(String) 2.노래제목(String) 3.출시년도(int) 4 시간초(int)
	 */
	private String singer;
	private String title;
	private int year;
	private int time;
	private int listNumber;
	private String path;
	
	MP3Player mp3 = new MP3Player();
	
	
	
	public Music(String singer, String title, int year, int time, String path) {
		super();
		this.singer = singer;
		this.title = title;
		this.year = year;
		this.time = time;
		this.path = path;
	}
	public Music(String singer, String title, int year, int time) {
		super();
		this.singer = singer;
		this.title = title;
		this.year = year;
		this.time = time;
	}
	

	public Music() {
		
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getSinger() {
		return singer;
	}
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	public int getTime() {
		return time;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getListNumber() {
		return listNumber;
	}
	public void setListNumber(int listNumber) {
		this.listNumber = listNumber;
	}
	
	public void __1__(ArrayList<Music> array, int listNumber) {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		System.out.println("====================================현재곡===================================");
		System.out.println();
		System.out.print(String.format("%-16s", array.get(listNumber).getSinger()));
		System.out.print("\t");
		System.out.print(String.format("%-16s", array.get(listNumber).getTitle()));
		System.out.print("\t");
		System.out.print(String.format("%-16s", array.get(listNumber).getYear()));
		System.out.print("\t");
		System.out.print(String.format("%-16s", array.get(listNumber).getTime()));
		System.out.println();
		System.out.println();
		System.out.println("===========================================================================");
		mp3.play(array.get(listNumber).getPath());
	}
	
	public void __2__() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
	}
	
	public void __3__(ArrayList<Music> array, int listNumber) {
		__2__();
		mp3.play(array.get(listNumber).getPath());
		System.out.println("====================================이전곡===================================");
		System.out.println();
		System.out.print(String.format("%-16s", array.get(listNumber).getSinger()));
		System.out.print("\t");
		System.out.print(String.format("%-16s", array.get(listNumber).getTitle()));
		System.out.print("\t");
		System.out.print(String.format("%-16s", array.get(listNumber).getYear()));
		System.out.print("\t");
		System.out.print(String.format("%-16s", array.get(listNumber).getTime()));
		System.out.println();
		System.out.println();
		System.out.println("===========================================================================");
		
	}
	
	public void __4__(ArrayList<Music> array, int listNumber) {
		__2__();
		mp3.play(array.get(listNumber).getPath());
		System.out.println("====================================다음곡===================================");
		System.out.println();
		System.out.print(String.format("%-16s", array.get(listNumber).getSinger()));
		System.out.print("\t");
		System.out.print(String.format("%-16s", array.get(listNumber).getTitle()));
		System.out.print("\t");
		System.out.print(String.format("%-16s", array.get(listNumber).getYear()));
		System.out.print("\t");
		System.out.print(String.format("%-16s", array.get(listNumber).getTime()));
		System.out.println();
		System.out.println();
		System.out.println("===========================================================================");
		
	}
	
	public void __5__(ArrayList<Music> array) {
		System.out.println("====================================목록====================================");
		for (int i=0; i <array.size();i++) {
			System.out.print(String.format("%-16s", array.get(i).getSinger()));
			System.out.print("\t");
			System.out.print(String.format("%-16s", array.get(i).getTitle()));
			System.out.print("\t");
			System.out.print(String.format("%-16s", array.get(i).getYear()));
			System.out.print("\t");
			System.out.print(String.format("%-16s", array.get(i).getTime()));
			System.out.println();
		}
		System.out.println("==========================================================================");
	}
	
	
	
	
	
	
}
