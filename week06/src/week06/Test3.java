package week06;

import java.util.Scanner;

public class Test3 {
	public static void main(String args[]) 
	{
		String str[][] = {{"연필","학교", "사랑", "행복", "자바"}, {"pencil","school","love","happy","java"}};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단어 사전 프로그램");
		
		loop: while(true){
		System.out.print("단어를 입력하세요 >> ");
		String user = sc.next();
		if(user.equals("그만") || user.equals("exit")){
			System.out.println("프로그램을 종료합니다.");
			break;
		}


		for(int i =0; i<2; i++)
			for(int j =0; j<5; j++){
				if(user.equals(str[0][j])) {
					System.out.println(str[1][j]);
					continue loop;
				}
				else if(user.equals(str[1][j])) {
					System.out.println(str[0][j]);
					continue loop;
				}
			}
		 System.out.println("잘못 입력했습니다. 다시 입력해주세요 !!!");
		}
		sc.close();
	}
}
