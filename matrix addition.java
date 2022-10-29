import java.io.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int a[][]=new int[10][10];
		int b[][]=new int [10][10];
		int c[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of matrix A");
		for(int i=0;i<2;i++)
		    for(int j=0;j<2;j++)
		    {
		    	a[i][j]=sc.nextInt();
		    }
		   System.out.println("Enter the elements of matrix B");
		    for(int i=0;i<2;i++)
		    for(int j=0;j<2;j++)
		    {
		    	b[i][j]=sc.nextInt();
		    }
		    for(int i=0;i<2;i++)
		    for(int j=0;j<2;j++)
		    {
		    	c[i][j]=a[i][j]+b[i][j];
		    }
		    System.out.println("Matrix c=");  
		    for(int i=0;i<2;i++)
		    {
		    for(int j=0;j<2;j++)
		    {
		        System.out.print("\t"+c[i][j]+"\t");
		    }
		    System.out.println();
		    }
		    
	}
}