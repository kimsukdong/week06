package week06;

import java.util.*;

public class Test4 {
	public static void main(String args[]) 
	{
		Random ran = new Random();
		String str[] = {"����","����", "��"};

		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true){
		System.out.print("���� ���� ��!>> ");
		String user = sc.next();
		if(user.equals("�׸�") || user.equals("exit")) {
			System.out.println("������ ��Ĩ�ϴ�.");
			break;
		}
		int n = ran.nextInt(3);
		
		System.out.println("����� = " + user + " , ��ǻ�� = "+ str[n]);
		
	
		if(user.equals("����")) {
			if(n==0) System.out.println("���º�");
			if(n==1) System.out.println("��ǻ�� ��");
			if(n==2) System.out.println("����� ��");
		}
		else if(user.equals("����")) {
			if(n==0) System.out.println("����� ��");
			if(n==1) System.out.println("���º�");
			if(n==2) System.out.println("��ǻ��  ��");
		}
		else if(user.equals("��")) {
			if(n==0) System.out.println("��ǻ�� ��");
			if(n==1) System.out.println("����� ��");
			if(n==2) System.out.println("���º�");
		}
		
		else System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է����ּ��� !!!");
		
		}
		sc.close();
	}
}
