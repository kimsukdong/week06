package week06;

import java.util.Scanner;

public class Test3 {
	public static void main(String args[]) 
	{
		String str[][] = {{"����","�б�", "���", "�ູ", "�ڹ�"}, {"pencil","school","love","happy","java"}};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ܾ� ���� ���α׷�");
		
		loop: while(true){
		System.out.print("�ܾ �Է��ϼ��� >> ");
		String user = sc.next();
		if(user.equals("�׸�") || user.equals("exit")){
			System.out.println("���α׷��� �����մϴ�.");
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
		 System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է����ּ��� !!!");
		}
		sc.close();
	}
}
