package week06;

public class Test1 {
	public static void main(String args[])
	{
		int twoD[][] = {{7,41,33,25}, {31,2,75}, {21,34,8}, {25,31,15,51}};

		int i, j;
		int k[] = new int[4];
		double a[] = new double[4];
		for(i=0 ; i < twoD.length ; i++){
			for(j=0 ; j< twoD[i].length ; j++)
			{
				k[i]+=twoD[i][j];
			}
			a[i]=(double)k[i]/twoD[i].length;
		}
		for(i=0 ; i < twoD.length ; i++) 
		{	
			for(int val : twoD[i])
				System.out.print(val + "\t");
			System.out.print(k[i]+"\t");
			System.out.println(a[i]);
		}

	}
}
