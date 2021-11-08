package sample05;

import java.util.Scanner;

import org.springframework.stereotype.Component;



@Component
public class SungJukImpl implements SungJuk{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public SungJukImpl() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름입력 : ");
		name = scan.next();
		
		System.out.print("국어 점수 입력 : ");
		kor = scan.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		eng = scan.nextInt();
		
		System.out.print("수학 점수 입력 : ");
		math = scan.nextInt();
		
		System.out.println();
		calc();
		display();
	}
	
	
	
	
	@Override
	public void calc() {
		 total = kor+eng+math;
		 avg = (double)total/3;
	}

	@Override
	public void display() {
		System.out.println("이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t");
		System.out.println(name+"\t\t"+kor+"\t\t"+eng+"\t\t"+math+"\t\t"+total+"\t\t"+String.format("%.3f", avg));
		
	}

}
