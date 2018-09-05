
import java.util.Scanner;

public class MatrixMultiply
{

   // Multiply 2 square matrices and returns the product of the 2 user entered matrices 

   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);		
      System.out.print("Enter dimension of square matrix: ");		
      int n=input.nextInt();
      int[][] m1=new int[n][n];
      System.out.println("Enter values for m1:");		
      readMatrix(m1, input);		
      int[][] m2=new int[n][n];
      System.out.println("Enter values for m2:");		
      readMatrix(m2, input);		
      int[][] m3= MatrixMulty (m1,m2);				
      System.out.println("Product of m1 and m2:");		
      printMatrix(m3);	
      input.close();	
   }
   

  // matrix m will be filled with values from user input separated by space
   
   public static void readMatrix(int[][] m1,Scanner input)
   {
      for(int i=0;i<m1.length;i++)
      {
         System.out.printf("\t\tEnter integers for row %d separated by white "
                 + "space: ",i);
	 for(int j=0;j<m1.length;j++)
	 {
	    m1[i][j]=input.nextInt();
       	 }
	 System.out.println();
      }
   }
  

   //Returns A matrix that is the Product of m1 and m2.

   public static int[][] MatrixMulty(int[][] m1,int[][] m2)
   {
      int[][] m3=new int[m1.length][m1.length];
      for(int i=0;i<m1.length;i++)
      {
         for(int j=0;j<m1.length;j++)
	 {	
	    int result=0;
	    int sum=0;
	    for(int k=0;k<m1.length;k++)
	    {
	       result=m1[i][k]*m2[k][j];
	       m3[i][j]+=result;
	    }
         }
      }
      return m3;
   }


   //Prints the product matrix or m3
   
   public static void printMatrix(int[][] m3)
   {
      for(int i=0;i<m3.length;i++)
      {
         for(int j=0;j<m3.length;j++)
	 {
	    System.out.print(m3[i][j]+" ");
	 }
	 System.out.println();
      }
   }
}