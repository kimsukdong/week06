package week06;

import java.util.Random;

public class Test2 {
	public static void main(String args[]) 
	{
		Random ran = new Random();
		int tot=0;
		int[][] score = new int[6][5];
		for(int i=0 ; i< 5 ; i++)
			for(int j=0; j<4 ; j++)
				score[i][j] = ran.nextInt(100)+1;
		
		for (int k=0 ; k < 5 ; k++) {
			int sum=0;
			/*
			 * 			for (int value : score[k]) {
				sum = sum + value;
				}
			 */
	
			for (int l=0; l<4 ; l++) {
				sum = sum + score[k][l];
				}	
			score[k][4]=sum;
			tot+=sum;
		}
		
		for (int k=0 ; k < 5 ; k++) {
			int sum=0;
			for (int l=0; l<5 ; l++) {
				sum = sum + score[l][k];
				}	
			score[5][k]=sum;
			
		}
		score[5][4]=tot;
		for(int i=0 ; i< 6 ; i++){
			for(int j=0; j< 5 ; j++)
				System.out.print("\t"+score[i][j]);
			System.out.println();
			}
	}  
}
