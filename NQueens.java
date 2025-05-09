public class NQueens {
	static int n=5;
	public static void main(String[] args) {
		char[][] board=new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]='0';
			}
		}
		solved(board,0);
	}
	static void solved(char[][] board,int row) {
		if(row==n) {
			printBoard(board);
			return;
		}
		for(int col=0;col<n;col++) {
			if(isSafe(board,row,col)) {
				board[row][col]='1';
				solved(board,row+1);
				board[row][col]='0';
			}
		}
	}
	static boolean isSafe(char board[][],int row,int col) {
		for(int i=0;i<row;i++) {
			if(board[i][col]=='1') 
				return false;
		}
		for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
			if(board[i][j]=='1')
					return false;
		}
		for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++) {
			if(board[i][j]=='1')
					return false;
		}
		return true;
	}
	static void printBoard(char[][] board) {
		System.out.println("Solution :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

