import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

	public int[][] twoDarray;
	public int row, col;

	public TwoDArray(int row, int col) {
		this.row = row;
		this.col = col;
		twoDarray = new int[row][col];
	}

	public static void main(String[] args) {

		TwoDArray arrObj = new TwoDArray(3, 3);

		arrObj.initializeArrayValues();

		arrObj.iterateArray();
	}

	public void iterateArray() {
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter("matrix.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int r = 0; r < row; r++) {

			for (int c = 0; c < col; c++) {
				printWriter.write(twoDarray[r][c] + "\t");
			}
			printWriter.write("\n");
		}
		printWriter.flush();
		printWriter.close();
		
		OutputStream os;
		OutputStreamWriter osw;
		try {
			os = new FileOutputStream("matrix1.txt");
			osw = new OutputStreamWriter(os);
			for (int r = 0; r < row; r++) {

				for (int c = 0; c < col; c++) {
					osw.write(twoDarray[r][c] + "\t");
				}
				osw.write("\n");
			}
			osw.flush();
			osw.close();
			os.flush();
			os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initializeArrayValues() {

		System.out.println("Enter the array elements");
		System.out.println("-------------------------");
		Scanner sc = new Scanner(System.in);

		for (int r = 0; r < row; r++) {

			for (int c = 0; c < col; c++) {
				System.out.print("[" + r + "][" + c + "] : ");
				twoDarray[r][c] = sc.nextInt();
			}
		}

		sc.close();
	}

}