import java.util.*;
class Matrix
{
	public static double DeterminentOf2x2(double a11,double a12,double a21,double a22 )
	{
		int size=Elements.length;
		double Deter=((a11*a22)-(a12*a21);
		return Deter;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		double[][] Elements;
		int Size,i,j;
		System.out.print("Enter the size of matrix(for ex. if 2x2 then type \"2\") :");
		Size=s.nextInt();
		Elements=new double[Size][Size];
		for(i=0;i<=Size-1;i++)
		{
			for(j=0;j<=Size-1;j++)
			{
				System.out.print("Enter row no."+(i+1)+", column no."+(j+1)+" value:");
				Elements[i][j]=s.nextDouble();
			}
			System.out.println();
		}
		double FINAL=0;
		for(i=0;i<=Size-1;i++)
		{
			for(j=0;j<=Size-1;j++)
			{
				FINAL=FINAL+(Math.pow(-1,i+j)*Elements[i][j]*DeterminentOf2x2());
			}
		}
		System.out.println("\nThe Determinent of :");
		for(i=0;i<=Size-1;i++)
		{		
			for(j=0;j<=Size-1;j++)
			{
				System.out.print(" "+Elements[i][j]);
			}
			System.out.println();
		}
		System.out.print("is "+FINAL);
	}
}