package Week7;
import java.util.Scanner;
public class additionofmatrix {
	public static void main(String[] args) {
		int matrix1[][]=new int[3][3];
		int matrix2[][]=new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter matrix size");
		int size=sc.nextInt();

		System.out.println("enter matrix 1 elements one by one");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) { 
				matrix1[i][j]=sc.nextInt();
			}
		}
	

		System.out.println("enter matrix2 elements one by one"); 
		for(int i=0;i<size;i++) { 
			for(int j=0;j<size;j++) {
				matrix2[i][j]=sc.nextInt(); 
			}
		}
		int result[][]=new int[3][3];
		for(int i=0;i<size;i++) {
			 for(int j=0;j<size;j++) {
				 result[i][j]=matrix1 [i][j]+matrix2[i][j];
			 }
		}
		System.out.println("Result matrix ");
		for(int	i=0;i<size;i++) {
			for(int	j=0;j<size;j++) {
				System.out.print(result[i][j]+" ");
		}
		System.out.println(" ");
		}
	}
}
	