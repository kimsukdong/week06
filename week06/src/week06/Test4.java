package week06;

import java.util.*;

public class Test4 {
	public static void main(String args[]) 
	{
		Random ran = new Random();
		String str[] = {"가위","바위", "보"};

		Scanner sc = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true){
		System.out.print("가위 바위 보!>> ");
		String user = sc.next();
		if(user.equals("그만") || user.equals("exit")) {
			System.out.println("게임을 마칩니다.");
			break;
		}
		int n = ran.nextInt(3);
		
		System.out.println("사용자 = " + user + " , 컴퓨터 = "+ str[n]);
		
	
		if(user.equals("가위")) {
			if(n==0) System.out.println("무승부");
			if(n==1) System.out.println("컴퓨터 승");
			if(n==2) System.out.println("사용자 승");
		}
		else if(user.equals("바위")) {
			if(n==0) System.out.println("사용자 승");
			if(n==1) System.out.println("무승부");
			if(n==2) System.out.println("컴퓨터  승");
		}
		else if(user.equals("보")) {
			if(n==0) System.out.println("컴퓨터 승");
			if(n==1) System.out.println("사용자 승");
			if(n==2) System.out.println("무승부");
		}
		
		else System.out.println("잘못 입력했습니다. 다시 입력해주세요 !!!");
		
		}
		sc.close();
	}
}
