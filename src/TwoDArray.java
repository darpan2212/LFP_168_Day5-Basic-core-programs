import java.util.Scanner;

public class TwoDArray {

	public int[][] twoDarray;
	public int row,col;
	
	public TwoDArray(int row, int col){
		this.row = row;
		this.col = col;
		twoDarray = new int[row][col];
	}

	public static void main(String[] args) {
	
		TwoDArray arrObj = new TwoDArray(3,3);

		arrObj.initializeArrayValues();

		arrObj.iterateArray();
	}
	
	public void iterateArray() {
		for (int r=0; r<row ;r++) {
		
			for (int c=0; c<col ; c++) {
				System.out.print(twoDarray[r][c]+"\t");
			}
			System.out.print("\n");
		}	
	}
	
	public void initializeArrayValues() {
	
		System.out.println("Enter the array elements");
		System.out.println("-------------------------");
		Scanner sc = new Scanner(System.in);
	
		for (int r=0; r<row ;r++) {
		
			for (int c=0; c<col ; c++) {
				System.out.print("["+r+"]["+c+"] : ");
				twoDarray[r][c] = sc.nextInt();
			}
		}	
	
		sc.close();
	}

}